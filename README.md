# ✏java 공부

## 🖥OpenJDK 11(11.0.1+13)
### https://jdk.java.net/archive/

## 🖥eclipse(2021-03)
### https://www.eclipse.org/downloads/packages/release/2021-03/r 


### ✔환경 변수 설정
![image](https://user-images.githubusercontent.com/115568532/221456070-1319b008-0692-4060-9555-796e408e3d43.png)


### ✔단축키Ctrl + F11 : 컴파일(실행) 
- Ctrl +  + / - : 폰트 크기 조절

- Ctrl + D : 한 줄 삭제

- Ctrl + Alt + Down(↓) : 행 복사 (여러 행도 가능)

- Alt + Shift + A : 멀티컬럼 편집 (영역을 선택하여 한 번에 편집 가능 / 종료할 때는 한 번 더 눌러주기)

- Alt + Up / Down : 행 단위 이동 (여러 행도 가능!)

- Tap : 들여쓰기 (여러 행도 가능)

- Shift + Tab : 내어쓰기 (여러 행도 가능)

- Ctrl + i : 자동 들여쓰기

- Ctrl + space : 자동완성

- 주석
  - 단일 주석 : Ctrl + /

  - 다중 주석 : Ctrl + Shift + / (해제:  Ctrl + Shift  + \ )

- 디버그(toggle breakpoint 후)
  - F11 : 디버그 모드 실행
  - F6 : 한 줄 한 줄 실행
  - F5 : 한 줄 한 줄 실행하되, 메소드가 있다면 메소드 안으로 들어감.

- Ctrl + Tab : 작업 파일 변경(이동)
  - Keys → Next Editer 에서 Ctrl + Tab으로 수정

### ✔Templates

#### - printf    
![image](https://user-images.githubusercontent.com/115568532/221458962-8cbfd7bf-59f7-4ed1-9e03-7e545cecb596.png)

    System.out.printf(${word_selection}${}, ${word_selection}${}${cursor});
    
#### - print
![image](https://user-images.githubusercontent.com/115568532/221460231-a581f6fa-e070-4362-95db-6e73721a571c.png)
    
    System.out.print(${word_selection}${});${cursor}
    
#### - BufferedReader
![image](https://user-images.githubusercontent.com/115568532/221459173-50563d59-40fb-4978-9ee1-a00dda7f20fe.png)
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
#### - Scanner
![image](https://user-images.githubusercontent.com/115568532/221459281-cc569b42-9df0-40cb-99dd-6f6f5d844290.png)

    Scanner scan = new Scanner(System.in);

#### - main
![image](https://user-images.githubusercontent.com/115568532/221460191-5c9d4417-5b94-4e34-8e2f-e83b3e0b0bdb.png)

    public static void main(String[] args) {

      ${cursor}

    } //main

### ✔확장 플러그인
- Eclipse Color Theme : 다크모드 설정을 위한 플러그인

- quick search : 패키지에 있는 파일을 쉽게 찾고 싶을 때, 키워드를 입력하면 해당 키워드가 들어간 클래스를 모두 찾아줌.
  - 단축키: Ctrl + Alt + Shift + L

### ✔GIT
- remote
  - git remote add origin https://github.com/sorrel012/jsp-practice

- remote 확인
  - git remote -v
  
- pull  
  - git pull origin main  
  
- add
  - git add -A (작업 내용 모두 추가)
  
- commit
  - git commit -m "메시지 내용"
  
- push
  - git push origin main
