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

