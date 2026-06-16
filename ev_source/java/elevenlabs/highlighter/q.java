package io.elevenlabs.highlighter;

import a2.a2;
import a2.z1;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import java.util.List;
import y4.d0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements ho.p {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ Object B0;
    public final /* synthetic */ Object C0;
    public final /* synthetic */ Object D0;
    public final /* synthetic */ Object E0;
    public final /* synthetic */ Object F0;
    public final /* synthetic */ Object G0;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f14231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.t f14232c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f14233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f14234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14235f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f14236x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f14237y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f14238z0;

    public /* synthetic */ q(Object obj, ho.l lVar, i3.t tVar, i3.t tVar2, InputState inputState, String str, String str2, String str3, ho.p pVar, a2 a2Var, z1 z1Var, d0 d0Var, boolean z6, int i10, int i11, int i12, int i13, int i14) {
        this.f14230a = i14;
        this.f14237y0 = obj;
        this.f14231b = lVar;
        this.f14232c = tVar;
        this.f14233d = tVar2;
        this.f14238z0 = inputState;
        this.A0 = str;
        this.B0 = str2;
        this.C0 = str3;
        this.D0 = pVar;
        this.E0 = a2Var;
        this.F0 = z1Var;
        this.G0 = d0Var;
        this.f14234e = z6;
        this.f14235f = i10;
        this.Y = i11;
        this.Z = i12;
        this.f14236x0 = i13;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z TextElement$lambda$14;
        sn.z Input$lambda$8;
        sn.z Input$lambda$14;
        switch (this.f14230a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TextElement$lambda$14 = HighlighterKt.TextElement$lambda$14(this.f14235f, (Styling) this.f14237y0, (org.jsoup.nodes.k) this.f14238z0, (HighlighterPosition) this.A0, (Integer) this.B0, (HighlighterData) this.C0, (List) this.D0, (t1.z) this.E0, this.f14234e, this.f14231b, (ho.l) this.F0, (ho.l) this.G0, this.f14232c, this.f14233d, this.Y, this.Z, this.f14236x0, (u2.m) obj, intValue);
                return TextElement$lambda$14;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Input$lambda$8 = InputKt.Input$lambda$8((String) this.f14237y0, this.f14231b, this.f14232c, this.f14233d, (InputState) this.f14238z0, (String) this.A0, (String) this.B0, (String) this.C0, (ho.p) this.D0, (a2) this.E0, (z1) this.F0, (d0) this.G0, this.f14234e, this.f14235f, this.Y, this.Z, this.f14236x0, (u2.m) obj, intValue2);
                return Input$lambda$8;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                Input$lambda$14 = InputKt.Input$lambda$14((y4.w) this.f14237y0, this.f14231b, this.f14232c, this.f14233d, (InputState) this.f14238z0, (String) this.A0, (String) this.B0, (String) this.C0, (ho.p) this.D0, (a2) this.E0, (z1) this.F0, (d0) this.G0, this.f14234e, this.f14235f, this.Y, this.Z, this.f14236x0, (u2.m) obj, intValue3);
                return Input$lambda$14;
        }
    }

    public /* synthetic */ q(int i10, Styling styling, org.jsoup.nodes.k kVar, HighlighterPosition highlighterPosition, Integer num, HighlighterData highlighterData, List list, t1.z zVar, boolean z6, ho.l lVar, ho.l lVar2, ho.l lVar3, i3.t tVar, i3.t tVar2, int i11, int i12, int i13) {
        this.f14230a = 0;
        this.f14235f = i10;
        this.f14237y0 = styling;
        this.f14238z0 = kVar;
        this.A0 = highlighterPosition;
        this.B0 = num;
        this.C0 = highlighterData;
        this.D0 = list;
        this.E0 = zVar;
        this.f14234e = z6;
        this.f14231b = lVar;
        this.F0 = lVar2;
        this.G0 = lVar3;
        this.f14232c = tVar;
        this.f14233d = tVar2;
        this.Y = i11;
        this.Z = i12;
        this.f14236x0 = i13;
    }
}
