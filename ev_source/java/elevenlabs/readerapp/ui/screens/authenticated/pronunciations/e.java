package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import r1.m2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16581b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f16580a = i10;
        this.f16581b = obj;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z PronunciationScreenUI$lambda$9$0$0$3$0;
        z PronunciationsListScreenUI$lambda$0;
        switch (this.f16580a) {
            case 0:
                PronunciationScreenUI$lambda$9$0$0$3$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$9$0$0$3$0((PronunciationState) this.f16581b, m2.f29267a, (u2.m) obj, ((Integer) obj2).intValue());
                return PronunciationScreenUI$lambda$9$0$0$3$0;
            default:
                PronunciationsListScreenUI$lambda$0 = PronunciationsListScreenKt.PronunciationsListScreenUI$lambda$0((ho.a) this.f16581b, (u2.m) obj, ((Integer) obj2).intValue());
                return PronunciationsListScreenUI$lambda$0;
        }
    }
}
