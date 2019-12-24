package templates;

public class Snippet {
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
	아이디:<span>[[${user.userId}]]</span><br>
	이름:<span>[[${user.userName}]]</span><br>
	나이:<span>[[${user.userAge}]]</span><br>
	<hr>
	아이디:<span th:text="${user.userId}"></span><br>
	이름:<span th:text="${user.userName}"></span><br>
	나이:<span th:text="${user.userAge}"></span><br>
	<hr>
	아이디:<span data-th-text="${user.userId}"></span><br>
	이름:<span data-th-text="${user.userName}"></span><br>
	나이:<span data-th-text="${user.userAge}"></span><br>
	</body>
	</html>
}
