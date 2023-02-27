package com.musinsa.musinsamenu.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="banner")
public class BannerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BANNER_ID")
    private Long id;

    @Column
    private String bannerImage;
    @Column
    private String bannerUrl;
}
