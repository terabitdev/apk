package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import ho.l;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerContract;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16229a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16231c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f16232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f16233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16234f;

    public /* synthetic */ d(float f10, boolean z6, long j4, l lVar, MiniPlayerViewModel miniPlayerViewModel, int i10, int i11) {
        this.f16230b = f10;
        this.f16231c = z6;
        this.f16232d = j4;
        this.f16233e = lVar;
        this.Z = miniPlayerViewModel;
        this.f16234f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z MiniPlayerUI_i2_NWbI$lambda$2;
        z MiniPlayer_GSIvlCE$lambda$3;
        switch (this.f16229a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                MiniPlayerUI_i2_NWbI$lambda$2 = MiniPlayerKt.MiniPlayerUI_i2_NWbI$lambda$2((MiniPlayerContract.UiState) this.Z, this.f16233e, this.f16230b, this.f16231c, this.f16232d, this.f16234f, this.Y, (m) obj, intValue);
                return MiniPlayerUI_i2_NWbI$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                MiniPlayer_GSIvlCE$lambda$3 = MiniPlayerKt.MiniPlayer_GSIvlCE$lambda$3(this.f16230b, this.f16231c, this.f16232d, this.f16233e, (MiniPlayerViewModel) this.Z, this.f16234f, this.Y, (m) obj, intValue2);
                return MiniPlayer_GSIvlCE$lambda$3;
        }
    }

    public /* synthetic */ d(MiniPlayerContract.UiState uiState, l lVar, float f10, boolean z6, long j4, int i10, int i11) {
        this.Z = uiState;
        this.f16233e = lVar;
        this.f16230b = f10;
        this.f16231c = z6;
        this.f16232d = j4;
        this.f16234f = i10;
        this.Y = i11;
    }
}
