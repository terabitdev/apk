package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.MicPermissionPromptKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.SelectPreviewStepKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements ho.p {
    public final /* synthetic */ sn.d Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3.t f14549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14553f;

    public /* synthetic */ d0(i3.t tVar, i3.g gVar, boolean z6, c3.j jVar, int i10, int i11) {
        this.f14548a = 5;
        this.f14549b = tVar;
        this.f14553f = gVar;
        this.f14550c = z6;
        this.Y = jVar;
        this.f14551d = i10;
        this.f14552e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z OfflineBannerDisplayingSurface$lambda$12;
        sn.z MicPermissionPrompt$lambda$2;
        sn.z VoiceDesignScreenContent$lambda$2;
        sn.z PreviewPage$lambda$2;
        switch (this.f14548a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OfflineBannerDisplayingSurface$lambda$12 = OfflineBannerDisplayingSurfaceKt.OfflineBannerDisplayingSurface$lambda$12(this.f14549b, this.f14550c, (ConnectivityService) this.f14553f, (ho.r) this.Y, this.f14551d, this.f14552e, (u2.m) obj, intValue);
                return OfflineBannerDisplayingSurface$lambda$12;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                MicPermissionPrompt$lambda$2 = MicPermissionPromptKt.MicPermissionPrompt$lambda$2((ho.a) this.f14553f, this.f14549b, this.f14550c, (ho.a) this.Y, this.f14551d, this.f14552e, (u2.m) obj, intValue2);
                return MicPermissionPrompt$lambda$2;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                VoiceDesignScreenContent$lambda$2 = VoiceDesignScreenKt.VoiceDesignScreenContent$lambda$2((VoiceDesignContract.State) this.f14553f, (ho.l) this.Y, this.f14549b, this.f14550c, this.f14551d, this.f14552e, (u2.m) obj, intValue3);
                return VoiceDesignScreenContent$lambda$2;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                PreviewPage$lambda$2 = SelectPreviewStepKt.PreviewPage$lambda$2((VoiceDesignContract.PreviewItem) this.f14553f, this.f14550c, (ho.a) this.Y, this.f14549b, this.f14551d, this.f14552e, (u2.m) obj, intValue4);
                return PreviewPage$lambda$2;
            case 4:
                ((Integer) obj2).getClass();
                m2.n0.a((ho.a) this.f14553f, this.f14549b, this.f14550c, (c3.j) this.Y, (u2.m) obj, u2.r.M(this.f14551d | 1), this.f14552e);
                return sn.z.f31622a;
            default:
                ((Integer) obj2).getClass();
                r1.d.a(this.f14549b, (i3.g) this.f14553f, this.f14550c, (c3.j) this.Y, (u2.m) obj, u2.r.M(this.f14551d | 1), this.f14552e);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ d0(ho.a aVar, i3.t tVar, boolean z6, sn.d dVar, int i10, int i11, int i12) {
        this.f14548a = i12;
        this.f14553f = aVar;
        this.f14549b = tVar;
        this.f14550c = z6;
        this.Y = dVar;
        this.f14551d = i10;
        this.f14552e = i11;
    }

    public /* synthetic */ d0(i3.t tVar, boolean z6, ConnectivityService connectivityService, ho.r rVar, int i10, int i11) {
        this.f14548a = 0;
        this.f14549b = tVar;
        this.f14550c = z6;
        this.f14553f = connectivityService;
        this.Y = rVar;
        this.f14551d = i10;
        this.f14552e = i11;
    }

    public /* synthetic */ d0(VoiceDesignContract.PreviewItem previewItem, boolean z6, ho.a aVar, i3.t tVar, int i10, int i11) {
        this.f14548a = 3;
        this.f14553f = previewItem;
        this.f14550c = z6;
        this.Y = aVar;
        this.f14549b = tVar;
        this.f14551d = i10;
        this.f14552e = i11;
    }

    public /* synthetic */ d0(VoiceDesignContract.State state, ho.l lVar, i3.t tVar, boolean z6, int i10, int i11) {
        this.f14548a = 2;
        this.f14553f = state;
        this.Y = lVar;
        this.f14549b = tVar;
        this.f14550c = z6;
        this.f14551d = i10;
        this.f14552e = i11;
    }
}
