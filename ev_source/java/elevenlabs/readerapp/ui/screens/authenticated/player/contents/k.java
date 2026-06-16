package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import ho.q;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.ui.components.ChipGroupKt;
import sn.z;
import u2.m;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements q {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16021a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f16023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16026f;

    public /* synthetic */ k(q qVar, Object obj, int i10, Object obj2, q qVar2, ho.l lVar) {
        this.f16024d = qVar;
        this.f16025e = obj;
        this.f16022b = i10;
        this.f16026f = obj2;
        this.Y = qVar2;
        this.f16023c = lVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z PlayerContentsScreenUI$lambda$3$0$0$0;
        z ChipGroup$lambda$2$0$0$0;
        switch (this.f16021a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                PlayerContentsScreenUI$lambda$3$0$0$0 = PlayerContentsScreenKt.PlayerContentsScreenUI$lambda$3$0$0$0((Chapter) this.f16024d, this.f16022b, (ReadMeta) this.f16025e, this.f16023c, (ho.a) this.f16026f, (s2) this.Y, (t1.b) obj, (m) obj2, intValue);
                return PlayerContentsScreenUI$lambda$3$0$0$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                ChipGroup$lambda$2$0$0$0 = ChipGroupKt.ChipGroup$lambda$2$0$0$0((q) this.f16024d, this.f16025e, this.f16022b, this.f16026f, (q) this.Y, this.f16023c, (t1.b) obj, (m) obj2, intValue2);
                return ChipGroup$lambda$2$0$0$0;
        }
    }

    public /* synthetic */ k(Chapter chapter, int i10, ReadMeta readMeta, ho.l lVar, ho.a aVar, s2 s2Var) {
        this.f16024d = chapter;
        this.f16022b = i10;
        this.f16025e = readMeta;
        this.f16023c = lVar;
        this.f16026f = aVar;
        this.Y = s2Var;
    }
}
