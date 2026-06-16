package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16612b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f16611a = i10;
        this.f16612b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z PronunciationItem$lambda$5$0$0$1;
        z PronunciationItem$lambda$3$0;
        z PronunciationItem$lambda$7$0;
        switch (this.f16611a) {
            case 0:
                PronunciationItem$lambda$5$0$0$1 = PronunciationsListScreenKt.PronunciationItem$lambda$5$0$0$1((z0) this.f16612b);
                return PronunciationItem$lambda$5$0$0$1;
            case 1:
                PronunciationItem$lambda$3$0 = PronunciationsListScreenKt.PronunciationItem$lambda$3$0((z0) this.f16612b);
                return PronunciationItem$lambda$3$0;
            default:
                PronunciationItem$lambda$7$0 = PronunciationsListScreenKt.PronunciationItem$lambda$7$0((ho.a) this.f16612b);
                return PronunciationItem$lambda$7$0;
        }
    }
}
