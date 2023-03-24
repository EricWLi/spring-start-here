# Chapter 3: Exercise 7

## 3.3 Dealing with circular dependencies
A circular dependency occurs when you define objects whose creation depends
on one another, causing a deadlock.

For example, object A depends on object B to be created.
Object B depends on Object A to be created.

This is a circular dependency.

When this occurs, you will see an error that looks similar to this:
```
Error creating bean with name 'parrot': Requested bean is currently in creation: Is there an unresolvable circular reference?
```