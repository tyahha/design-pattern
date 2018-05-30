this repo is my work of studing design pattern.

# Iterator Pattern
## 登場人物
### Iterator(反復子)
Aggregateから生成される.interface

### ConcreteIterator(具体的な反復子)
Iteratorのinterfaceを実装する具体的な反復子。
[BookShelfIterator]

### Aggregate(集合体)
イテレーションをする対象を保持する集合体のInterface。
Iteratorを生成する。

### ConcreteAggregate(具体的な集合体)
Aggregateのinterfaceを実装する具体的な集合体。
[BookShelf]

# Adapter Pattern
[interface]

## 登場人物
### Target(対象)
揃えたいinterfaceそのもの
[Print]

### Client(依頼者)
Targetを使用する
[Main]

### Adaptee(適合される側)
[Banner]

### Adapter
Targetのinterfaceを実装し、Adapteeを適合する
継承による実装と移譲による実装がある
[PrintBannerInheritance]
[PrintBannerAggregate]

# Template Method
## メリット
* ロジックやアルゴリズムが共通化できる


## 登場人物
### AbstractClass(抽象クラス)
テンプレートメソッドを実装する。  
テンプレートメソッドで使用する中小メソッドを宣言する。  
[AbstractDisplay]

### ConcreteClass(具象クラス)
AbstractClassを継承して抽象メソッドを実装する。  
[CharDisplay]  
[StringDisplay]

# Factory method
## 登場人物
### Product(製品)
生成されるインスタンスが持つべきインターフェースを定める抽象クラス
[Product]

### Creator(作成者)
Productを生成する抽象クラス
[Factory]

### ConcreteCreator(具体的製品)
[IDCard]

### ConcreteProduct
[IDCardFactory]

# Singleton
## 登場人物
### Singleton
唯一のインスタンス  
[Singleton]

# Prototype
## 登場人物
### Prototype(原型)
[Product]

### ConcreteProduct(具体的な原型)
[MessageBox]  
[UnderlinePen]

### Client(利用者)
[Manager]

# Builder
## 登場人物
### Builder(建築者)
インスタンスを生成するためのインターフェース(API)を定める  
[Builder]

### ConcreteBuilder(具体的建築者)
[TextBuilder]  
[HTMLBuilder]

### Director(監督役)
Builderのインターフェースを使用してインスタンスを生成する  
[Director]

### Client(依頼人)
[Main]


# Abstract Factroy
## 登場人物
### AbstractProdut(抽象的な製品)
[Link]  
[Tray]  
[Page]

### AbstractFactroy(抽象的な工場)
[Factory]

### Client
[Main]

### ConcreteProduct(具体的な製品)
[ListLink]  
[ListTray]  
[ListPage]  
[TableLink]  
[TableTray]  
[TablePage]

### ConcreteFactory(具体的な工場)
[ListFactory]  
[TableFactory]

# Bridge
## 登場人物
### Abstraction(抽象化)
「機能のクラス階層」の最上位のクラス  
Implementor役のメソッドを使って基本的な機能だけが記述される  
[Display]

### RefinedAbstraction(改善した抽象化)
Abstractionに対して機能を追加する  
[Implementor]

### Implementor(実装者)
「実装のクラス階層」の最上位のクラス  
Abstraction役のインターフェース(API)を実装するためのメソッドを規定する役  
[DisplayImpl]

### ConcreteImplementor(具体的な実装者)
[StringDisplayImpl]

# Strategy
## 登場人物
### Strategy(戦略)
[Strategy]

### ConcreteStrategy(具体的な戦略)
[WinningStrategy]  
[ProbStrategy]

### Context(文脈)
[Player]

# Composite
木構造など再起的なデータ構造を表現する

## 登場人物
### Leaf(葉)
[File]

### Composite(複合体)
[Directory]

### Componant
[Entry]

### Client
[Main]

# Decorator
## 登場人物
### Component
[Display]

### ConcreteComponent
[StringDisplay]

### Decorator
[Border]

### ConcreteDecorator
[SideBorder]  
[FullBorder]

# Visitor
## 登場人物
### Visitor(訪問者)
[Visitor]

### ConcreteVisitor
[ListVisitor]

### Element
[Element]

### ConcreteElement
[File]  
[Directory]

### ObjectStructure
[Directory]

# Chain of Responsibility
## 登場人物
### Handler
[Support]

### ConcreteHandler
[NoSupport]  
[LimitSupport]  
[OddSupport]  
[SpecialSupport]  

### Client
[Main]