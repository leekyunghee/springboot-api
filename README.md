# springboot-api
* 스프링부트 프로젝트 구조는 다음과 같습니다.

|   pom.xml

        +---src

        |   +---main

        |   |   +---java

        |   |   |   \---com

        |   |   |       \---tutorial

        |   |   |           \---springboot

        |   |   |                   Application.java

        |   |   |

        |   |   \---resources

        |   |       |   application.properties

        |   |       |

        |   |       +---static

|   |       \---template

        |   \---test

        |       \---java

## src/main/java
**자바 소스 파일**
## src/test/java
**자바 테스트 파일**
## src/resources/application.properties
**스프링 부트 프로퍼티 값들을 모아놓은 파일**
## src/static
**html, css 같은 정적 파일을 모아놓은 디렉터리**
## src/template
**JSP 파일 경로로 동적으로 값이 변환되는 파일을 모아놓은 디렉터리**

## @SpringBootApplication 어노테이션의 소스에 붙어있는 @ComponentScan 어노테이션은 해당 클래스 기준으로 위치와 그 아래 위치까지 스프링 빈을 나타내는 어노테이션이 붙은 클래스를 찾는다.
- **main/resources/application.properties 파일을 생성**
- **데이터소스 접속 정보를 작성한다.**
