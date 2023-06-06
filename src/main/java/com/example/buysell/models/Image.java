package com.example.buysell.models;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String originalFileName;
    private Long size;
    private String contentType;
    private boolean previewImage;
    @Lob
    private byte[] bytes;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Product product;

    public Image() {
    }

    public Image(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.originalFileName = builder.originalFileName;
        this.size = builder.size;
        this.contentType = builder.contentType;
        this.previewImage = builder.previewImage;
        this.bytes = builder.bytes;
        this.product = builder.product;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public Long getSize() {
        return size;
    }

    public String getContentType() {
        return contentType;
    }

    public boolean isPreviewImage() {
        return previewImage;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public Product getProduct() {
        return product;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setPreviewImage(boolean previewImage) {
        this.previewImage = previewImage;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String originalFileName;
        private Long size;
        private String contentType;
        private boolean previewImage;
        private byte[] bytes;
        private Product product;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }

        public Builder setSize(Long size) {
            this.size = size;
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setPreviewImage(boolean previewImage) {
            this.previewImage = previewImage;
            return this;
        }

        public Builder setBytes(byte[] bytes) {
            this.bytes = bytes;
            return this;
        }

        public Builder setProduct(Product product) {
            this.product = product;
            return this;
        }

        public Image build() {
            return new Image(this);
        }
    }
}