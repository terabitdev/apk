package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16546e;

    public /* synthetic */ x1(kotlin.jvm.internal.d0 d0Var, PlaybackPosition playbackPosition, String str, PlayerViewModel playerViewModel) {
        this.f16542a = 1;
        this.f16545d = d0Var;
        this.f16546e = playbackPosition;
        this.f16543b = str;
        this.f16544c = playerViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState emit$lambda$1$0;
        PlayerState invokeSuspend$lambda$2;
        sn.z PlayerScreenUI$lambda$44$29$0;
        switch (this.f16542a) {
            case 0:
                emit$lambda$1$0 = PlayerViewModel.AnonymousClass15.AnonymousClass3.emit$lambda$1$0((String) this.f16543b, (ReadMeta) this.f16545d, (PlayerViewModel) this.f16544c, (fr.d0) this.f16546e, (PlayerState) obj);
                return emit$lambda$1$0;
            case 1:
                invokeSuspend$lambda$2 = PlayerViewModel$load$1$1.AnonymousClass1.invokeSuspend$lambda$2((kotlin.jvm.internal.d0) this.f16545d, (PlaybackPosition) this.f16546e, (String) this.f16543b, (PlayerViewModel) this.f16544c, (PlayerState) obj);
                return invokeSuspend$lambda$2;
            default:
                PlayerScreenUI$lambda$44$29$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$29$0((ho.l) this.f16543b, (ir.z1) this.f16545d, (u2.z0) this.f16544c, (u2.z0) this.f16546e, (Analytics.Event.PlayerActionSource) obj);
                return PlayerScreenUI$lambda$44$29$0;
        }
    }

    public /* synthetic */ x1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f16542a = i10;
        this.f16543b = obj;
        this.f16545d = obj2;
        this.f16544c = obj3;
        this.f16546e = obj4;
    }
}
