package com.mangopay.core.APIs.implementation;

import com.mangopay.MangoPayApi;
import com.mangopay.core.*;
import com.mangopay.core.APIs.ApiBase;
import com.mangopay.core.APIs.ApiKycDocuments;
import com.mangopay.entities.KycDocument;
import java.util.List;

/**
 * API for KycDocuments.
 */
public class KycDocumentApiImpl extends ApiBase implements ApiKycDocuments {
    
    /**
     * Instantiates new KycDocumentApiImpl object.
     * @param root Root/parent instance that holds the OAuthToken and Configuration instance
     */
    public KycDocumentApiImpl(MangoPayApi root) { super(root); }
    
    @Override
    public List<KycDocument> getAll(Pagination pagination, Sorting sorting) throws Exception {
        return this.getList(KycDocument[].class, KycDocument.class, "kyc_documents_all", pagination, sorting);
    }
    
    @Override
    public KycDocument getKycDocument(String kycDocumentId) throws Exception {
        return this.getObject(KycDocument.class, "kyc_document_get", kycDocumentId);
    }
}
