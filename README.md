# โjava ๊ณต๋ถ

<br/>

## ๐ฅOpenJDK 11(11.0.1+13)
### https://jdk.java.net/archive/

<br/>

## ๐ฅeclipse(2021-03)
### https://www.eclipse.org/downloads/packages/release/2021-03/r 

<br/>

### โํ๊ฒฝ ๋ณ์ ์ค์ 
![image](https://user-images.githubusercontent.com/115568532/221456070-1319b008-0692-4060-9555-796e408e3d43.png)

<br/>

### โ๋จ์ถํคCtrl + F11 : ์ปดํ์ผ(์คํ) 
- Ctrl +  + / - : ํฐํธ ํฌ๊ธฐ ์กฐ์ 

- Ctrl + D : ํ ์ค ์ญ์ 

- Ctrl + Alt + Down(โ) : ํ ๋ณต์ฌ (์ฌ๋ฌ ํ๋ ๊ฐ๋ฅ)

- Alt + Shift + A : ๋ฉํฐ์ปฌ๋ผ ํธ์ง (์์ญ์ ์ ํํ์ฌ ํ ๋ฒ์ ํธ์ง ๊ฐ๋ฅ / ์ข๋ฃํ  ๋๋ ํ ๋ฒ ๋ ๋๋ฌ์ฃผ๊ธฐ)

- Alt + Up / Down : ํ ๋จ์ ์ด๋ (์ฌ๋ฌ ํ๋ ๊ฐ๋ฅ!)

- Tap : ๋ค์ฌ์ฐ๊ธฐ (์ฌ๋ฌ ํ๋ ๊ฐ๋ฅ)

- Shift + Tab : ๋ด์ด์ฐ๊ธฐ (์ฌ๋ฌ ํ๋ ๊ฐ๋ฅ)

- Ctrl + i : ์๋ ๋ค์ฌ์ฐ๊ธฐ

- Ctrl + space : ์๋์์ฑ

- ์ฃผ์
  - ๋จ์ผ ์ฃผ์ : Ctrl + /

  - ๋ค์ค ์ฃผ์ : Ctrl + Shift + / (ํด์ :  Ctrl + Shift  + \ )

- ๋๋ฒ๊ทธ(toggle breakpoint ํ)
  - F11 : ๋๋ฒ๊ทธ ๋ชจ๋ ์คํ
  - F6 : ํ ์ค ํ ์ค ์คํ
  - F5 : ํ ์ค ํ ์ค ์คํํ๋, ๋ฉ์๋๊ฐ ์๋ค๋ฉด ๋ฉ์๋ ์์ผ๋ก ๋ค์ด๊ฐ.

- Ctrl + Tab : ์์ ํ์ผ ๋ณ๊ฒฝ(์ด๋)
  - Keys โ Next Editer ์์ Ctrl + Tab์ผ๋ก ์์ 

<br/>

### โTemplates

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
    
<br/>

### โํ์ฅ ํ๋ฌ๊ทธ์ธ
- Eclipse Color Theme : ๋คํฌ๋ชจ๋ ์ค์ ์ ์ํ ํ๋ฌ๊ทธ์ธ

- quick search : ํจํค์ง์ ์๋ ํ์ผ์ ์ฝ๊ฒ ์ฐพ๊ณ  ์ถ์ ๋, ํค์๋๋ฅผ ์๋ ฅํ๋ฉด ํด๋น ํค์๋๊ฐ ๋ค์ด๊ฐ ํด๋์ค๋ฅผ ๋ชจ๋ ์ฐพ์์ค.
  - ๋จ์ถํค: Ctrl + Alt + Shift + L

<br/>

### โGIT
- remote
  - git remote add origin https://github.com/sorrel012/jsp-practice

- remote ํ์ธ
  - git remote -v
  
- pull  
  - git pull origin main  
  
- add
  - git add -A (์์ ๋ด์ฉ ๋ชจ๋ ์ถ๊ฐ)
  
- commit
  - git commit -m "๋ฉ์์ง ๋ด์ฉ"
  
- push
  - git push origin main
