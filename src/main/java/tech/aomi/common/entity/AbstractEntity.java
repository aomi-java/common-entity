package tech.aomi.common.entity;

/**
 * 基础表实体
 * 使用Long作为ID主键
 *
 * @author Sean sean.snow@live.com
 * createAt 2015/12/9
 */
public class AbstractEntity implements java.io.Serializable {

    private static final long serialVersionUID = -405095894795875151L;

    private Long id;

    public AbstractEntity() {
    }

    public AbstractEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /**
     * 返回该实体序列名字
     *
     * @return 序列名
     */
    public String sequence() {
        return generateSequenceName(this.getClass());
    }

    protected <T extends AbstractEntity> String generateSequenceName(Class<T> entity) {
        String regex = "([a-z])([A-Z])";
        String replacement = "$1_$2";
        return entity.getSimpleName().replaceAll(regex, replacement).toLowerCase() + "_seq";
    }

}
