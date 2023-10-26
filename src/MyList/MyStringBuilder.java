package MyList;
import java.util.ArrayList;
import java.util.List;

public class MyStringBuilder {
        private StringBuilder stringBuilder;
        private final List<Operation> operations;

        public MyStringBuilder() {
            this.stringBuilder = new StringBuilder();
            this.operations = new ArrayList<>();
        }
    public MyStringBuilder(String string) {
        this.stringBuilder = new StringBuilder();
        this.operations = new ArrayList<>();
    }


    public StringBuilder append(String str) {
            Operation operation = new AppendOperation(str);
            operations.add(operation);
            operation.execute();
            return stringBuilder;
        }

        public StringBuilder delete(int start, int end) {
            DeleteOperation deleteOperation = new DeleteOperation(start, end);
            operations.add(deleteOperation);
            deleteOperation.execute();
            return stringBuilder;
        }

        public StringBuilder insert(int offset, String str) {
            Operation operation = new InsertOperation(offset, str);
            operations.add(operation);
            operation.execute();
            return stringBuilder;
        }

        public StringBuilder replace(int start, int end, String str) {
            Operation operation = new ReplaceOperation(start, end, str);
            operations.add(operation);
            operation.execute();
            return stringBuilder;
        }

        public StringBuilder reverse() {
            ReverseOperation reverseOperation = new ReverseOperation();
            operations.add(reverseOperation);
            reverseOperation.execute();
            return stringBuilder;
        }

        public void undo() {
            if (!operations.isEmpty()) {
                Operation lastOperation = operations.remove(operations.size() - 1);
                lastOperation.undo();
            }
        }

        @Override
        public String toString() {
            return stringBuilder.toString();
        }

        private interface Operation {
            void execute();

            void undo();
        }

        private class AppendOperation implements Operation {
            private final String str;

            public AppendOperation(String str) {
                this.str = str;
            }

            @Override
            public void execute() {
                stringBuilder.append(str);
            }

            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - str.length(), stringBuilder.length());
            }
        }

        private class DeleteOperation implements Operation {
            private final int start;
            private final int end;
            private String deleted;

            public DeleteOperation(int start, int end) {
                this.start = start;
                this.end = end;
            }

            @Override
            public void execute() {
                deleted = stringBuilder.substring(start, end);
                stringBuilder.delete(start, end);
            }

            @Override
            public void undo() {
                stringBuilder.insert(start, deleted);
            }
        }

        private class InsertOperation implements Operation {
            private final int offset;
            private final String str;

            public InsertOperation(int offset, String str) {
                this.offset = offset;
                this.str = str;
            }

            @Override
            public void execute() {
                stringBuilder.insert(offset, str);
            }

            @Override
            public void undo() {
                stringBuilder.delete(offset, offset + str.length());
            }
        }

        private class ReplaceOperation implements Operation {
            private final int start;
            private final int end;
            private final String str;
            private String replaced;

            public ReplaceOperation(int start, int end, String str) {
                this.start = start;
                this.end = end;
                this.str = str;
            }

            @Override
            public void execute() {
                replaced = stringBuilder.substring(start, end);
                stringBuilder.replace(start, end, str);
            }

            @Override
            public void undo() {
                stringBuilder.replace(start, start + str.length(), replaced);
            }
        }

        private class ReverseOperation implements Operation {
            private String original;

            @Override
            public void execute() {
                original = stringBuilder.toString();
                stringBuilder.reverse();
            }

            @Override
            public void undo() {
                stringBuilder = new StringBuilder(original);
            }
        }
    }


