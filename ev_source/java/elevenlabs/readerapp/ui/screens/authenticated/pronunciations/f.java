package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import io.elevenlabs.domain.model.Pronunciation;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16584c;

    public /* synthetic */ f(ho.l lVar, Object obj, int i10) {
        this.f16582a = i10;
        this.f16583b = lVar;
        this.f16584c = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z PronunciationScreenUI$lambda$9$0$1$0;
        z PronunciationItem$lambda$5$0$0$0;
        switch (this.f16582a) {
            case 0:
                PronunciationScreenUI$lambda$9$0$1$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$9$0$1$0(this.f16583b, (PronunciationState) this.f16584c);
                return PronunciationScreenUI$lambda$9$0$1$0;
            default:
                PronunciationItem$lambda$5$0$0$0 = PronunciationsListScreenKt.PronunciationItem$lambda$5$0$0$0(this.f16583b, (Pronunciation) this.f16584c);
                return PronunciationItem$lambda$5$0$0$0;
        }
    }
}
