# Демо проект автоматизированного тестирования главной страницы [BLANC банк](https://blanc.ru/)
## Содержание
- [Стэк](Стэк)
- [Проверки](Проверки)
- [Запуск из терминала](Запуск-из-терминала)
- [Сборка в Jenkins](Сборка-в-Jenkins)
- Allure отчеты
- Telegram уведомления
- Видео

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
#### Локальный запуск с парамтерами
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

## [Сборка в Jenkins](https://jenkins.autotests.cloud/job/012-onen0ne-13-Blanc-demo-tests/)

