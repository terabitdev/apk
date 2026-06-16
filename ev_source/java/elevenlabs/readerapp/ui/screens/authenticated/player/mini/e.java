package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import androidx.lifecycle.t;
import ho.l;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel;
import p4.b0;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16236b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f16235a = i10;
        this.f16236b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        MiniPlayerContract.DomainState emit$lambda$0;
        MiniPlayerContract.DomainState emit$lambda$02;
        z MiniPlayerUI_i2_NWbI$lambda$0$0;
        z MiniPlayer_GSIvlCE$lambda$1$0;
        switch (this.f16235a) {
            case 0:
                emit$lambda$0 = MiniPlayerViewModel.AnonymousClass1.AnonymousClass3.emit$lambda$0((PlayerConnectionState) this.f16236b, (MiniPlayerContract.DomainState) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = MiniPlayerViewModel.AnonymousClass3.C00433.emit$lambda$0((ReadMeta) this.f16236b, (MiniPlayerContract.DomainState) obj);
                return emit$lambda$02;
            case 2:
                MiniPlayerUI_i2_NWbI$lambda$0$0 = MiniPlayerKt.MiniPlayerUI_i2_NWbI$lambda$0$0((String) this.f16236b, (b0) obj);
                return MiniPlayerUI_i2_NWbI$lambda$0$0;
            default:
                MiniPlayer_GSIvlCE$lambda$1$0 = MiniPlayerKt.MiniPlayer_GSIvlCE$lambda$1$0((MiniPlayerViewModel) this.f16236b, (t) obj);
                return MiniPlayer_GSIvlCE$lambda$1$0;
        }
    }
}
