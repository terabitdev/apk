package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16579b;

    public /* synthetic */ d(ho.l lVar, int i10) {
        this.f16578a = i10;
        this.f16579b = lVar;
    }

    @Override // ho.a
    public final Object invoke() {
        z PronunciationScreenUI$lambda$9$0$0$1$0;
        z PronunciationScreenUI$lambda$9$0$0$2$0;
        z GetFeedbackItem$lambda$0$0;
        switch (this.f16578a) {
            case 0:
                PronunciationScreenUI$lambda$9$0$0$1$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$9$0$0$1$0(this.f16579b);
                return PronunciationScreenUI$lambda$9$0$0$1$0;
            case 1:
                PronunciationScreenUI$lambda$9$0$0$2$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$9$0$0$2$0(this.f16579b);
                return PronunciationScreenUI$lambda$9$0$0$2$0;
            default:
                GetFeedbackItem$lambda$0$0 = PronunciationsListScreenKt.GetFeedbackItem$lambda$0$0(this.f16579b);
                return GetFeedbackItem$lambda$0$0;
        }
    }
}
