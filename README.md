# Демо проект автоматизированного тестирования главной страницы [BLANC банк](https://blanc.ru/)
## Содержание
1. [Стэк](#стэк)
2. [Проверки](#проверки)
3. [Запуск тестов](#запуск-тестов)
4. [Сборка в Jenkins](#Сборка-в-Jenkins)
5. [Allure отчёт](#allure-отчёт)
6. [Видеопример прохождения теста](#видеопример-прохождения-теста)
7. [Уведомления в Telegram](#уведомления-в-Telegram)

## Стэк

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## Проверки

- Отображение тултипа при наведении указателя на кнопку "Личный кабинет"
- Отображение тултипа с курсами валют
- Открытие / закрытие сайдбара
- Переход к форме подтверждения по клику на кнопку "Открыть счёт"
- Переход к форме подтверждения по клику на кнопку "Открыть счёт" в заголовке страницы
- Ввод номера телефона в форме подтверждения
- Закрытие тултипа "Личный кабинет" при клике вне тултипа (пример упавшего теста)
- Ввод текста в поле для обратной связи (пример деактивированного теста)

## Запуск тестов

#### Параметры запуска
<code>REMOTE</code> - URL хоста для удалённого запуска  

<code>BROWSER</code> – браузер, в котором будут выполняться тесты (по-умолчанию <code>chrome</code>) 

<code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (по-умолчанию <code>1920x1080</code>)  

#### Локальный запуск с параметрами по-умолчанию
```
gradle clean test
```
#### Локальный запуск с параметерами
```
gradle clean test
-Dremote=${REMOTE}
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
```
#### Запуск с параметрами в Jenkins (Invoke Gradle script task)
```
clean test
-Dremote=${REMOTE}
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
```

## Сборка в Jenkins
[Ссылка на сборку](https://jenkins.autotests.cloud/job/012-onen0ne-13-Blanc-demo-tests/)

<p align="left">
<img title="Jenkins job overview" src="images/screenshots/jenkins-overview.png" width="1000">
</p>

## Allure отчёт

<p align="left">
<img title="Allure report overview" src="images/screenshots/allure-suites.png" width="1000">
</p>

<p align="left">
<img title="Allure detailed steps" src="images/screenshots/allure-detailed.png" width="1000">
</p>

## Видеопример прохождения теста

В отчёте к каждому тесту прикладывается видео с прохождением этого теста. Ниже пример прохождения одного из тестов.

#### Enter the phone number and check if 'submit' button appears

<p align="left">
<img title="Video example" src="images/gif/example.gif" width="1000">
</p>

## Уведомления в Telegram

По завершении тестов отправляется краткий отчёт в Telegram

<p align="left">
<img title="Video example" src="images/screenshots/tg-notification.png" width="400">
</p>

