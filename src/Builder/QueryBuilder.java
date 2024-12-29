package Builder;

public class QueryBuilder {

    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    private QueryBuilder(){ }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public Builder select(String select) {
            this.select = select;
            return this;
        }

        public Builder from(String from) {
            this.from = from;
            return this;
        }

        public Builder where(String where) {
            this.where = where;
            return this;
        }

        public Builder join(String join) {
            this.join = join;
            return this;
        }

        public Builder orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder groupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        public QueryBuilder build() {
            QueryBuilder query = new QueryBuilder();
            query.select = this.select;
            query.from = this.from;
            query.where = this.where;
            query.join = this.join;
            query.orderBy = this.orderBy;
            query.groupBy = this.groupBy;
            return query;
        }

    }

}
