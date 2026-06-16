package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.Analytics;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16344a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16346c;

    public /* synthetic */ t0(ho.l lVar, ho.l lVar2) {
        this.f16345b = lVar;
        this.f16346c = lVar2;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PlayerErrorToast$lambda$1;
        sn.z PlayerScreenUI$lambda$44$28$0;
        switch (this.f16344a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PlayerErrorToast$lambda$1 = PlayerScreenKt.PlayerErrorToast$lambda$1((PlayerToastMessage) this.f16346c, this.f16345b, (u2.m) obj, intValue);
                return PlayerErrorToast$lambda$1;
            default:
                PlayerScreenUI$lambda$44$28$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$28$0(this.f16345b, (ho.l) this.f16346c, (String) obj, (Analytics.Event.PlayerActionSource) obj2);
                return PlayerScreenUI$lambda$44$28$0;
        }
    }

    public /* synthetic */ t0(PlayerToastMessage playerToastMessage, ho.l lVar) {
        this.f16346c = playerToastMessage;
        this.f16345b = lVar;
    }
}
