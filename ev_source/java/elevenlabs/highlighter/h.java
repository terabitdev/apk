package io.elevenlabs.highlighter;

import io.elevenlabs.readerapp.ui.components.ExpandableTextKt;
import io.elevenlabs.ui.components.ChipGroupKt;
import java.util.List;
import java.util.Stack;
import s4.p0;
import s4.u0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ho.l {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14190a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14195f;

    public /* synthetic */ h(int i10, String str, z0 z0Var, z0 z0Var2, String str2, p0 p0Var) {
        this.f14191b = i10;
        this.f14192c = str;
        this.f14193d = z0Var;
        this.f14194e = z0Var2;
        this.f14195f = str2;
        this.Y = p0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z append$lambda$0;
        sn.z ExpandableText_0Zdzm9U$lambda$8$0;
        sn.z ChipGroup$lambda$2$0;
        switch (this.f14190a) {
            case 0:
                append$lambda$0 = HighlighterKt.append$lambda$0((org.jsoup.nodes.k) this.f14192c, (Styling) this.f14193d, (Stack) this.f14194e, this.f14191b, (List) this.f14195f, (List) this.Y, (s4.e) obj);
                return append$lambda$0;
            case 1:
                ExpandableText_0Zdzm9U$lambda$8$0 = ExpandableTextKt.ExpandableText_0Zdzm9U$lambda$8$0(this.f14191b, (String) this.f14192c, (z0) this.f14193d, (z0) this.f14194e, (String) this.f14195f, (p0) this.Y, (u0) obj);
                return ExpandableText_0Zdzm9U$lambda$8$0;
            default:
                ChipGroup$lambda$2$0 = ChipGroupKt.ChipGroup$lambda$2$0((Iterable) this.f14192c, (ho.q) this.f14193d, this.f14191b, this.f14194e, (ho.q) this.f14195f, (ho.l) this.Y, (t1.t) obj);
                return ChipGroup$lambda$2$0;
        }
    }

    public /* synthetic */ h(Iterable iterable, ho.q qVar, int i10, Object obj, ho.q qVar2, ho.l lVar) {
        this.f14192c = iterable;
        this.f14193d = qVar;
        this.f14191b = i10;
        this.f14194e = obj;
        this.f14195f = qVar2;
        this.Y = lVar;
    }

    public /* synthetic */ h(org.jsoup.nodes.k kVar, Styling styling, Stack stack, int i10, List list, List list2) {
        this.f14192c = kVar;
        this.f14193d = styling;
        this.f14194e = stack;
        this.f14191b = i10;
        this.f14195f = list;
        this.Y = list2;
    }
}
