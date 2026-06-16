package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f16361b;

    public /* synthetic */ v1(List list, int i10) {
        this.f16360a = i10;
        this.f16361b = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState emit$lambda$0;
        PlayerState invokeSuspend$lambda$0;
        switch (this.f16360a) {
            case 0:
                emit$lambda$0 = PlayerViewModel.AnonymousClass10.AnonymousClass1.emit$lambda$0(this.f16361b, (PlayerState) obj);
                return emit$lambda$0;
            default:
                invokeSuspend$lambda$0 = PlayerViewModel.AnonymousClass18.AnonymousClass5.invokeSuspend$lambda$0(this.f16361b, (PlayerState) obj);
                return invokeSuspend$lambda$0;
        }
    }
}
