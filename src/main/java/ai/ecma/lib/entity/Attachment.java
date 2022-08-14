package ai.ecma.lib.entity;

import ai.ecma.lib.entity.template.AbsLong;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Murtazayev Muhammad
 * @since 14.01.2022
 */
@Entity
@Table(name = "attachment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Where(clause = "deleted=false")
@SQLDelete(sql = "update attachment set deleted = false where id = ?")
public class Attachment extends AbsLong {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "size")
    private Long size;

    @Column(name = "original_name", nullable = false)
    private String originalName;

    @Column(name = "content_type", nullable = false)
    private String contentType;
}
