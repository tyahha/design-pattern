this repo is my work of studing design pattern.

# Iterator Pattern
## 登場人物
### Iterator(反復子)
Aggregateから生成される.interface

### ConcreteIterator(具体的な反復子)
Iteratorのinterfaceを実装する具体的な反復子。
このリポジトリの例ではBookShelfIteratorがそれにあたる

### Aggregate(集合体)
イテレーションをする対象を保持する集合体のInterface。
Iteratorを生成する。

### ConcreteAggregate(具体的な集合体)
Aggregateのinterfaceを実装する具体的な集合体。
このリポジトリではBookShelfがそれにあたる。