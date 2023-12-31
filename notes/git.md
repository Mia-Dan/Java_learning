

copy this:

git log --author=Mia-Dan --pretty=tformat: --numstat --after="one week ago" | awk '{ add += $1; subs += $2 } END { printf "+%d, -%d, total = %d\n", add, subs, add+subs }'

\# in 7 days



git log --author=Mia-Dan --pretty=tformat: --numstat --since="midnight" | awk '{ add += $1; subs += $2 } END { printf "+%d, -%d, total = %d\n", add, subs, add+subs }'

\# today's




```
example

since midnight

35      11      FloatDemo.java
41      0       FloatDemo.java
0       0       ChangeChar.java
0       0       Comment.java
0       0       Hello.java
3       1       Java Notes.md
0       0       JavaTypesDemo.java
0       0       OpPlusDemo.java
0       0       PrimitiveTypeDemo.java
0       0       Types.java
0       0       WebScraper.java
4       0       git.md

---

since yesterday (which would be 24 hours earlier)

35      11      FloatDemo.java
41      0       FloatDemo.java
0       0       ChangeChar.java
0       0       Comment.java
0       0       Hello.java
3       1       Java Notes.md
0       0       JavaTypesDemo.java
0       0       OpPlusDemo.java
0       0       PrimitiveTypeDemo.java
0       0       Types.java
0       0       WebScraper.java
4       0       git.md
5       0       JavaTypesDemo.java
33      0       JavaTypesDemo.java
```

.

```shell
git log --author=Mia-Dan --pretty=tformat: --numstat | awk '{ add += $1; subs += $2 } END { printf "+%d, -%d, total = %d\n", add, subs, all }'
```




```shell
(base) hadoop@ShanXinYue:~/Desktop$ git log --author=Mia-Dan --pretty=tformat: --numstat | awk '{ add += $1 } END { print add }'
510
```

> You:
> `git diff --stat` looks helpful. How to use that if I want to see total number of insertions over several file change commits
>
> Bot:
> You can use the following command to see the total number of insertions over several file change commits:
>
> ```
> git log --author=<author> --pretty=tformat: --numstat | awk '{ add += $1 } END { print add }'
> ```
>
> Replace `<author>` with the author name you want to filter by.
>
> This command will show the total number of insertions made by the author in all commits.
>
> 

> ```shell
> (base) hadoop@ShanXinYue:~/Desktop$ git log --author=Mia-Dan --pretty=tformat: --numstat --after="one week ago" | awk '{ add += $1 } END { print add }' 
> 31
> 
> (base) hadoop@ShanXinYue:~/Desktop$ git log --author=Mia-Dan --pretty=tformat: --numstat | awk '{ add += $1; subs += $2 } END { printf "+%d, -%d\n", add, subs }'
> +510, -56
> 
> (base) hadoop@ShanXinYue:~/Desktop$ git log --author=Mia-Dan --pretty=tformat: --numstat | awk '{ add += $1; subs += $2 } END { printf "+%d, -%d, total = %d\n", add, subs, add+subs}'
> +510, -56, total = 566
> 
> ```



PRECISE


```shell
(base) hadoop@ShanXinYue:~/Desktop$ git lg --stat --after="one week ago"

281f0c2 exer: WebScraper
 WebScraper.java | 14 ++++++++++++--
 1 file changed, 12 insertions(+), 2 deletions(-)
4aa1df5 exer: WebScraper
 WebScraper.java | 19 +++++++++++++++++++
 1 file changed, 19 insertions(+)
```



ROUGH

```shell
(base) hadoop@ShanXinYue:~/Desktop$ git diff --stat 9c71f34

 ChangeChar.java |  27 ++++++++++++
 Comment.java    |  37 ++++++++++++++++
 Hello.class     | Bin 414 -> 0 bytes
 Hello.java      |  31 ++++++++++++--
 Java Notes.md   | 295 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 Types.java      |  34 +++++++++++++++
 WebScraper.java |  29 +++++++++++++
 7 files changed, 449 insertions(+), 4 deletions(-)
```
