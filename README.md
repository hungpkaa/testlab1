# testlab1

Bài tập mẫu: có **ít nhất 1 vòng lặp** và **1 lệnh rẽ nhánh** trong một phương thức, kèm 2 issue về kiểm thử JUnit: statement coverage và path coverage.

## Yêu cầu
- Java 21+ (hoặc chỉnh `maven.compiler.release` trong `pom.xml`)
- Maven 3.9+

## Chạy chương trình
```bash
mvn -q -DskipTests package
java -cp target/classes com.example.score.App 3 -1
```

## Chạy kiểm thử
```bash
mvn test
```
