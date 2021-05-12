package com.jayant.lean.data.entity;

import com.jayant.lean.data.entity.dto.DescriptionDto;
import com.jayant.lean.data.repository.ItemStatus;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "item")
@Audited
@Getter
@Setter
@NoArgsConstructor
public class Item {
  @Id
  @Column(name = "id")
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "description")
  private DescriptionDto description;
  @Column(name = "item_status")
  private ItemStatus itemStatus;
  @Column(name = "created_at")
  private LocalDateTime createdAt;
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @PrePersist
  public void addTimeStamp() {
    this.createdAt = LocalDateTime.now();
    this.updatedAt = LocalDateTime.now();
  }

  @PreUpdate
  public void updateTimeStamp() {
    this.updatedAt = LocalDateTime.now();
  }
}
