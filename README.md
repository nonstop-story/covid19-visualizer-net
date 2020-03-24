# covid19-visualizer-net

Network component of the covid-19 visualizer.

This library was built to be a module of the Processing language.

## Usage

### 创建实例
```java
VirusService service = VirusServices.create();
```

一切网络操作都需要通过 `service` 进行

### 获取全球今日情况
```java
Day day = service.today().execute().body();
```

样例|返回类型|用途
:---:|:---:|:---:
`day.getCountry()` | String | 数据来源国家。如果为全球数据，返回值为 `null`
`day.isGlobal()` | boolean | 判断该数据是否是全球数据
`day.getDate()` | Date | 数据的日期
`day.getConfirmed()` | int | 累计确诊人数
`day.getDeaths()` | int | 累计死亡人数
`day.getRecorvered()`| int | 累计治愈人数

### 获取自爆发以来的全球每日情况
```java
List<Day> days = service.allDays().execute().body();
```

### 获取单个国家自爆发以来的每日情况
```java
List<Day> days = service.country("国家名").execute().body();
```

## 获取所有国家自爆发以来的每日情况
```java
List<Day> days = service.allCountries().execute().body();
```

## Acknowledge

We would like to thank [JetBrains](https://www.jetbrains.com/?from=KiVM) for sharing free
open-source licences of amazing tools such as [Intellij IDEA](https://www.jetbrains.com/idea/?from=KiVM).

[<img src="logo/jetbrains.png" width="200"/>](https://www.jetbrains.com/?from=KiVM)

## Credit
* Data Source: (covid-19api.com)[http://covid-19api.com/]
