SELECT
    POST.TITLE as postTitle,
    TAG.DESCRIPTION as tagDescription,
    AUTHOR.NAME as authorName
FROM POST
INNER JOIN POST_TAG ON POST_TAG.ID_POST = POST.ID
INNER JOIN TAG ON TAG.ID = POST_TAG.ID_TAG
INNER JOIN POST_AUTHOR ON POST_AUTHOR.ID_POST = POST.ID
INNER JOIN AUTHOR ON AUTHOR.ID = POST_AUTHOR.ID_AUTHOR
WHERE 1=1
/* if (authorId != null) */
  and AUTHOR.ID = :authorId
/* endif  */
/* if (tagId != null) */
  and TAG.ID = :tagId
/* endif  */