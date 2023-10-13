package net.geeksbox.demo.restfulspringboot.repository;

import net.geeksbox.demo.restfulspringboot.model.Picture_Of_PostEnity;
import net.geeksbox.demo.restfulspringboot.model.PostModel;
import net.geeksbox.demo.restfulspringboot.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostModelRepository extends JpaRepository<PostModel, Integer> {
	
	@Query(value="WITH UserIDs AS\n"
			+ "(\n"
			+ "    SELECT DISTINCT FRIENDS.user_id1 AS user_id\n"
			+ "    FROM FRIENDS\n"
			+ "    WHERE FRIENDS.user_id2 = ?1\n"
			+ "    UNION\n"
			+ "    SELECT DISTINCT FRIENDS.user_id2 AS user_id\n"
			+ "    FROM FRIENDS\n"
			+ "    WHERE FRIENDS.user_id1 = ?1\n"
			+ ")\n"
			+ "SELECT\n"
			+ "    POSTS.post_id,\n"
			+ "    USERS.first_name,\n"
			+ "    USERS.last_name,\n"
			+ "    USERS.profile_picture,\n"
			+ "    POSTS.content_post,\n"
			+ "    POSTS.timestamp,\n"
			+ "    POSTS.status,\n"
			+ "    'User' AS post_source,\n"
			+ "    COUNT(DISTINCT COMMENTS.comment_id) AS comment_count,\n"
			+ "    COUNT(DISTINCT INTERACTIONS.interaction_id) AS like_count,\n"
			+ "	 CASE\n"
			+ "        WHEN EXISTS (\n"
			+ "            SELECT 1\n"
			+ "            FROM INTERACTIONS\n"
			+ "            WHERE INTERACTIONS.post_id = POSTS.post_id\n"
			+ "            AND INTERACTIONS.user_id = ?1\n"
			+ "        ) THEN 'true'\n"
			+ "        ELSE 'false'\n"
			+ "    END AS user_liked\n"
			+ "FROM POSTS\n"
			+ "INNER JOIN UserIDs ON UserIDs.user_id = POSTS.user_id\n"
			+ "INNER JOIN USERS ON USERS.user_id = UserIDs.user_id\n"
			+ "LEFT JOIN Follow_User ON UserIDs.user_id = Follow_User.user_is_followed_id\n"
			+ "LEFT JOIN COMMENTS ON POSTS.post_id = COMMENTS.post_id\n"
			+ "LEFT JOIN INTERACTIONS ON POSTS.post_id = INTERACTIONS.post_id\n"
			+ "GROUP BY POSTS.post_id, USERS.first_name, USERS.last_name, USERS.profile_picture, POSTS.content_post, POSTS.timestamp, POSTS.status;\n"
			+ "",nativeQuery = true)
	public  List<PostModel> ListPost(int userid);
}
