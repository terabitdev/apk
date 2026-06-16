package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import r1.l2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn.d f16591b;

    public /* synthetic */ i(sn.d dVar, int i10) {
        this.f16590a = i10;
        this.f16591b = dVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z PronunciationScreenUI$lambda$8$0$0;
        z PronunciationsListScreenUI$lambda$0$0;
        z PronunciationsListScreenUI$lambda$1$0$1$0$2;
        switch (this.f16590a) {
            case 0:
                PronunciationScreenUI$lambda$8$0$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$8$0$0((ho.a) this.f16591b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return PronunciationScreenUI$lambda$8$0$0;
            case 1:
                PronunciationsListScreenUI$lambda$0$0 = PronunciationsListScreenKt.PronunciationsListScreenUI$lambda$0$0((ho.a) this.f16591b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return PronunciationsListScreenUI$lambda$0$0;
            default:
                PronunciationsListScreenUI$lambda$1$0$1$0$2 = PronunciationsListScreenKt.PronunciationsListScreenUI$lambda$1$0$1$0$2((ho.l) this.f16591b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return PronunciationsListScreenUI$lambda$1$0$1$0$2;
        }
    }
}
