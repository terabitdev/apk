package io.elevenlabs.data.services;

import io.elevenlabs.data.model.response.AssistantInitResponse;
import io.elevenlabs.data.model.response.GetCreditHistorySectionsResponse;
import io.elevenlabs.data.model.response.GetExploreSearchResponse;
import io.elevenlabs.data.model.response.SupportAgentInitResponse;
import io.elevenlabs.domain.model.SupportAgentConfig;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14113b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f14112a = i10;
        this.f14113b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        SupportAgentConfig initializeSupportAgent$lambda$0;
        switch (this.f14112a) {
            case 0:
                return AssistantServiceImpl.a((AssistantServiceImpl) this.f14113b, (AssistantInitResponse) obj);
            case 1:
                return CustomerServiceImpl.c((CustomerServiceImpl) this.f14113b, (GetCreditHistorySectionsResponse) obj);
            case 2:
                return OnboardingServiceImpl.a((List) this.f14113b, (List) obj);
            case 3:
                return ReadsExploreServiceImpl.b((ReadsExploreServiceImpl) this.f14113b, (GetExploreSearchResponse) obj);
            default:
                initializeSupportAgent$lambda$0 = SupportAgentServiceImpl.initializeSupportAgent$lambda$0((SupportAgentServiceImpl) this.f14113b, (SupportAgentInitResponse) obj);
                return initializeSupportAgent$lambda$0;
        }
    }
}
