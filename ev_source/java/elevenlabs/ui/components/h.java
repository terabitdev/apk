package io.elevenlabs.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.AudioOnlyPlayerUiKt;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.p {
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f17410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f17411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f17412f;

    public /* synthetic */ h(String str, float f10, float f11, i3.t tVar, String str2, int i10, int i11) {
        this.f17407a = 2;
        this.f17408b = str;
        this.f17411e = f10;
        this.f17412f = f11;
        this.f17410d = tVar;
        this.f17409c = str2;
        this.Y = i10;
        this.Z = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z AutoScrollingChipRow_6PoWaU8$lambda$0;
        sn.z AutoScrollingChipRow_6PoWaU8$lambda$13;
        sn.z PlayerCoverArt_TN_CM5M$lambda$0;
        switch (this.f17407a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AutoScrollingChipRow_6PoWaU8$lambda$0 = AutoScrollingChipRowKt.AutoScrollingChipRow_6PoWaU8$lambda$0((List) this.f17408b, (ho.l) this.f17409c, this.f17410d, this.f17411e, this.f17412f, this.Y, this.Z, (u2.m) obj, intValue);
                return AutoScrollingChipRow_6PoWaU8$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                AutoScrollingChipRow_6PoWaU8$lambda$13 = AutoScrollingChipRowKt.AutoScrollingChipRow_6PoWaU8$lambda$13((List) this.f17408b, (ho.l) this.f17409c, this.f17410d, this.f17411e, this.f17412f, this.Y, this.Z, (u2.m) obj, intValue2);
                return AutoScrollingChipRow_6PoWaU8$lambda$13;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                PlayerCoverArt_TN_CM5M$lambda$0 = AudioOnlyPlayerUiKt.PlayerCoverArt_TN_CM5M$lambda$0((String) this.f17408b, this.f17411e, this.f17412f, this.f17410d, (String) this.f17409c, this.Y, this.Z, (u2.m) obj, intValue3);
                return PlayerCoverArt_TN_CM5M$lambda$0;
        }
    }

    public /* synthetic */ h(List list, ho.l lVar, i3.t tVar, float f10, float f11, int i10, int i11, int i12) {
        this.f17407a = i12;
        this.f17408b = list;
        this.f17409c = lVar;
        this.f17410d = tVar;
        this.f17411e = f10;
        this.f17412f = f11;
        this.Y = i10;
        this.Z = i11;
    }
}
