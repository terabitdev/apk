package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import a2.a2;
import a2.k3;
import a2.z1;
import com.google.firebase.messaging.Constants;
import f4.f1;
import id.c0;
import io.elevenlabs.domain.model.AvailableFilters;
import io.elevenlabs.domain.model.Filter;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.VoiceFiltersFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.e1;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.ChipGroupKt;
import io.elevenlabs.ui.components.ChipKt;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import io.elevenlabs.ui.components.SelectKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q2.y2;
import r1.c3;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.v0;
import r1.w;
import r1.x;
import r1.y;
import rd.c1;
import s4.y0;
import sn.z;
import tn.v;
import u2.r1;
import u2.z0;
import y4.d0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\u0013\u001a\u00020\u0004*\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aa\u0010\u0017\u001a\u00020\u0004*\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001a¨\u0006&²\u0006\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010!\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020$8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/FiltersState;", "filters", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/SelectFiltersEvent;", "Lsn/z;", "onFiltersSelected", "Lkotlin/Function0;", "onDismiss", "VoiceFiltersDialog", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/FiltersState;Lho/l;Lho/a;Lu2/m;I)V", "Lt1/t;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "Lio/elevenlabs/domain/model/Filter;", "availableFilters", "", "activeFilters", "onFilterClick", "filterChips", "(Lt1/t;ILjava/util/List;Ljava/util/Set;Lho/l;)V", "activeFilter", "getFilterIcon", "filterSelect", "(Lt1/t;ILjava/util/List;Lio/elevenlabs/domain/model/Filter;Lho/l;Lho/q;)V", "Preview_VoiceFiltersDialog_idle", "(Lu2/m;I)V", "Preview_VoiceFiltersDialog_loaded", "activeSort", "activeUseCases", "activeAge", "activeGender", "activeLanguage", "activeAccent", "", "showOptions", "", "searchValue", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceFiltersDialogKt {
    public static final void Preview_VoiceFiltersDialog_idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2101836576);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            FiltersState filtersState = new FiltersState(null, null, null, null, null, null, null, 127, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new q(18);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new i(1);
                qVar.h0(L2);
            }
            VoiceFiltersDialog(filtersState, lVar, (ho.a) L2, qVar, 432);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j(i10, 6);
        }
    }

    public static final z Preview_VoiceFiltersDialog_idle$lambda$0$0(SelectFiltersEvent selectFiltersEvent) {
        selectFiltersEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFiltersDialog_idle$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoiceFiltersDialog_idle(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceFiltersDialog_loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(651084943);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            FiltersState filtersState = new FiltersState(VoiceFiltersFactoryKt.stubVoiceFilters(), null, null, null, null, null, null, 126, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new q(17);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new i(2);
                qVar.h0(L2);
            }
            VoiceFiltersDialog(filtersState, lVar, (ho.a) L2, qVar, 432);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j(i10, 7);
        }
    }

    public static final z Preview_VoiceFiltersDialog_loaded$lambda$0$0(SelectFiltersEvent selectFiltersEvent) {
        selectFiltersEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFiltersDialog_loaded$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoiceFiltersDialog_loaded(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0400  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoiceFiltersDialog(FiltersState filtersState, final ho.l lVar, final ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        tn.t tVar;
        String str;
        z0 z0Var;
        z0 z0Var2;
        z0 z0Var3;
        z0 z0Var4;
        z0 z0Var5;
        z0 z0Var6;
        float f10;
        u2.e eVar;
        z0 z0Var7;
        z0 z0Var8;
        z0 z0Var9;
        z0 z0Var10;
        z0 z0Var11;
        z0 z0Var12;
        boolean z10;
        boolean z11;
        boolean z12;
        Object L;
        int i13;
        int i14;
        int i15;
        i3.j jVar = i3.d.B0;
        filtersState.getClass();
        lVar.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1554075885);
        if ((i10 & 6) == 0) {
            if (qVar.h(filtersState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            x a10 = w.a(r1.j.f29230c, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            boolean f11 = qVar.f(filtersState.getActiveSort());
            Object L2 = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (f11 || L2 == eVar2) {
                L2 = u2.r.A(filtersState.getActiveSort());
                qVar.h0(L2);
            }
            z0 z0Var13 = (z0) L2;
            boolean f12 = qVar.f(filtersState.getActiveUseCases());
            Object L3 = qVar.L();
            if (f12 || L3 == eVar2) {
                Set<Filter> activeUseCases = filtersState.getActiveUseCases();
                if (activeUseCases == null) {
                    activeUseCases = v.f33549a;
                }
                L3 = u2.r.A(activeUseCases);
                qVar.h0(L3);
            }
            z0 z0Var14 = (z0) L3;
            boolean f13 = qVar.f(filtersState.getActiveAge());
            Object L4 = qVar.L();
            if (f13 || L4 == eVar2) {
                L4 = u2.r.A(filtersState.getActiveAge());
                qVar.h0(L4);
            }
            z0 z0Var15 = (z0) L4;
            boolean f14 = qVar.f(filtersState.getActiveGender());
            Object L5 = qVar.L();
            if (f14 || L5 == eVar2) {
                L5 = u2.r.A(filtersState.getActiveGender());
                qVar.h0(L5);
            }
            z0 z0Var16 = (z0) L5;
            boolean f15 = qVar.f(filtersState.getActiveLanguage());
            Object L6 = qVar.L();
            if (f15 || L6 == eVar2) {
                L6 = u2.r.A(filtersState.getActiveLanguage());
                qVar.h0(L6);
            }
            z0 z0Var17 = (z0) L6;
            boolean f16 = qVar.f(filtersState.getActiveAccent());
            Object L7 = qVar.L();
            if (f16 || L7 == eVar2) {
                L7 = u2.r.A(filtersState.getActiveAccent());
                qVar.h0(L7);
            }
            z0 z0Var18 = (z0) L7;
            boolean f17 = qVar.f(filtersState.getAvailable()) | qVar.f(VoiceFiltersDialog$lambda$0$13(z0Var17));
            Object L8 = qVar.L();
            if (!f17 && L8 != eVar2) {
                i12 = i11;
            } else {
                AvailableFilters available = filtersState.getAvailable();
                if (available != null) {
                    if (VoiceFiltersDialog$lambda$0$13(z0Var17) != null) {
                        List<Filter> accents = available.getAccents();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : accents) {
                            int i16 = i11;
                            Filter filter = (Filter) obj;
                            if (filter instanceof Filter.Accent) {
                                String language = ((Filter.Accent) filter).getLanguage();
                                Filter VoiceFiltersDialog$lambda$0$13 = VoiceFiltersDialog$lambda$0$13(z0Var17);
                                if (VoiceFiltersDialog$lambda$0$13 != null) {
                                    str = VoiceFiltersDialog$lambda$0$13.getKey();
                                } else {
                                    str = null;
                                }
                                if (kotlin.jvm.internal.m.c(language, str)) {
                                    arrayList.add(obj);
                                }
                            }
                            i11 = i16;
                        }
                        i12 = i11;
                        tVar = arrayList;
                    } else {
                        i12 = i11;
                        tVar = tn.t.f33547a;
                    }
                    L8 = AvailableFilters.copy$default(available, null, null, null, null, null, null, tVar, 63, null);
                } else {
                    i12 = i11;
                    L8 = null;
                }
                qVar.h0(L8);
            }
            AvailableFilters availableFilters = (AvailableFilters) L8;
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i17 = ElevenLabsTheme.$stable;
            d2 f18 = r1.d.f(t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i17).m2357getX5D9Ej5fM(), 7);
            boolean h10 = qVar.h(availableFilters) | qVar.f(z0Var13) | qVar.f(z0Var17) | qVar.f(z0Var18) | qVar.f(z0Var14) | qVar.f(z0Var15) | qVar.f(z0Var16);
            Object L9 = qVar.L();
            if (!h10 && L9 != eVar2) {
                z0Var = z0Var13;
                z0Var2 = z0Var17;
                z0Var5 = z0Var18;
                z0Var3 = z0Var14;
                z0Var6 = z0Var15;
                z0Var4 = z0Var16;
            } else {
                z0Var = z0Var13;
                z0Var2 = z0Var17;
                z0Var3 = z0Var14;
                z0Var4 = z0Var16;
                z0Var5 = z0Var18;
                z0Var6 = z0Var15;
                L9 = new id.m(availableFilters, z0Var, z0Var17, z0Var18, z0Var14, z0Var15, z0Var16, 3);
                qVar.h0(L9);
            }
            z0 z0Var19 = z0Var;
            z0 z0Var20 = z0Var3;
            z0 z0Var21 = z0Var6;
            z0 z0Var22 = z0Var4;
            z0 z0Var23 = z0Var2;
            z0 z0Var24 = z0Var5;
            int i18 = i12;
            c1.c(m1Var, null, f18, false, null, null, null, false, null, (ho.l) L9, qVar, 0, 506);
            i3.t e10 = p2.e(qVar2, 1.0f);
            x a11 = w.a(r1.j.f29230c, jVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            h4.e eVar3 = h4.g.f11907f;
            u2.r.J(eVar3, a11, qVar);
            h4.e eVar4 = h4.g.f11906e;
            u2.r.J(eVar4, l7, qVar);
            Integer valueOf = Integer.valueOf(hashCode2);
            h4.e eVar5 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar5);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar6 = h4.g.f11905d;
            u2.r.J(eVar6, c10, qVar);
            i3.t E = r1.d.E(qVar2, elevenLabsTheme.getSpacings(qVar, i17).m2356getX4D9Ej5fM());
            k2 a12 = i2.a(ib.i.n(elevenLabsTheme, qVar, i17), i3.d.f13004y0, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(E, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar3, a12, qVar);
            u2.r.J(eVar4, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar5, qVar, dVar);
            u2.r.J(eVar6, c11, qVar);
            String R = kj.c.R(qVar, R.string.voices_filters_actions_reset);
            ButtonVariant buttonVariant = ButtonVariant.Secondary;
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f;
            }
            m1 m1Var2 = new m1(f10, true);
            ButtonSize buttonSize = ButtonSize.Medium;
            boolean f19 = qVar.f(z0Var19) | qVar.f(z0Var20) | qVar.f(z0Var21) | qVar.f(z0Var22) | qVar.f(z0Var23) | qVar.f(z0Var24);
            Object L10 = qVar.L();
            if (!f19) {
                eVar = eVar2;
                if (L10 != eVar) {
                    z0Var12 = z0Var19;
                    z0Var8 = z0Var23;
                    z0Var7 = z0Var24;
                    z0Var11 = z0Var20;
                    z0Var10 = z0Var21;
                    z0Var9 = z0Var22;
                    ho.a aVar2 = (ho.a) L10;
                    u2.e eVar7 = eVar;
                    final z0 z0Var25 = z0Var12;
                    final z0 z0Var26 = z0Var11;
                    final z0 z0Var27 = z0Var10;
                    final z0 z0Var28 = z0Var9;
                    final z0 z0Var29 = z0Var8;
                    final z0 z0Var30 = z0Var7;
                    ButtonKt.Button(R, aVar2, m1Var2, buttonSize, buttonVariant, null, null, false, false, false, qVar, 27648, 992);
                    String R2 = kj.c.R(qVar, R.string.voices_filters_actions_apply);
                    if ((i18 & 112) != 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean f20 = qVar.f(z0Var25) | z10 | qVar.f(z0Var26) | qVar.f(z0Var27) | qVar.f(z0Var28) | qVar.f(z0Var29) | qVar.f(z0Var30);
                    if ((i18 & 896) != 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = f20 | z11;
                    L = qVar.L();
                    if (!z12 || L == eVar7) {
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.u
                            @Override // ho.a
                            public final Object invoke() {
                                z VoiceFiltersDialog$lambda$0$20$0$1$0;
                                VoiceFiltersDialog$lambda$0$20$0$1$0 = VoiceFiltersDialogKt.VoiceFiltersDialog$lambda$0$20$0$1$0(ho.l.this, aVar, z0Var25, z0Var26, z0Var27, z0Var28, z0Var29, z0Var30);
                                return VoiceFiltersDialog$lambda$0$20$0$1$0;
                            }
                        };
                        qVar.h0(L);
                    }
                    ho.a aVar3 = (ho.a) L;
                    float f21 = 1.5f;
                    if (1.5f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    if (1.5f > Float.MAX_VALUE) {
                        f21 = Float.MAX_VALUE;
                    }
                    ButtonKt.Button(R2, aVar3, new m1(f21, true), buttonSize, null, null, null, false, false, false, qVar, 3072, 1008);
                    qVar.p(true);
                    WeakHashMap weakHashMap = c3.f29142x;
                    r1.d.g(r1.d.N(u0.e(qVar).f29154l), qVar);
                    qVar.p(true);
                    qVar.p(true);
                }
            } else {
                eVar = eVar2;
            }
            L10 = new f3.b(z0Var19, z0Var20, z0Var21, z0Var22, z0Var23, z0Var24, 2);
            z0Var7 = z0Var24;
            z0Var8 = z0Var23;
            z0Var9 = z0Var22;
            z0Var10 = z0Var21;
            z0Var11 = z0Var20;
            z0Var12 = z0Var19;
            qVar.h0(L10);
            ho.a aVar22 = (ho.a) L10;
            u2.e eVar72 = eVar;
            final z0 z0Var252 = z0Var12;
            final z0 z0Var262 = z0Var11;
            final z0 z0Var272 = z0Var10;
            final z0 z0Var282 = z0Var9;
            final z0 z0Var292 = z0Var8;
            final z0 z0Var302 = z0Var7;
            ButtonKt.Button(R, aVar22, m1Var2, buttonSize, buttonVariant, null, null, false, false, false, qVar, 27648, 992);
            String R22 = kj.c.R(qVar, R.string.voices_filters_actions_apply);
            if ((i18 & 112) != 32) {
            }
            boolean f202 = qVar.f(z0Var252) | z10 | qVar.f(z0Var262) | qVar.f(z0Var272) | qVar.f(z0Var282) | qVar.f(z0Var292) | qVar.f(z0Var302);
            if ((i18 & 896) != 256) {
            }
            z12 = f202 | z11;
            L = qVar.L();
            if (!z12) {
            }
            L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.u
                @Override // ho.a
                public final Object invoke() {
                    z VoiceFiltersDialog$lambda$0$20$0$1$0;
                    VoiceFiltersDialog$lambda$0$20$0$1$0 = VoiceFiltersDialogKt.VoiceFiltersDialog$lambda$0$20$0$1$0(ho.l.this, aVar, z0Var252, z0Var262, z0Var272, z0Var282, z0Var292, z0Var302);
                    return VoiceFiltersDialog$lambda$0$20$0$1$0;
                }
            };
            qVar.h0(L);
            ho.a aVar32 = (ho.a) L;
            float f212 = 1.5f;
            if (1.5f <= 0.0d) {
            }
            if (1.5f > Float.MAX_VALUE) {
            }
            ButtonKt.Button(R22, aVar32, new m1(f212, true), buttonSize, null, null, null, false, false, false, qVar, 3072, 1008);
            qVar.p(true);
            WeakHashMap weakHashMap2 = c3.f29142x;
            r1.d.g(r1.d.N(u0.e(qVar).f29154l), qVar);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 24, lVar, (Object) filtersState, (Object) aVar);
        }
    }

    private static final Filter VoiceFiltersDialog$lambda$0$1(z0 z0Var) {
        return (Filter) z0Var.getValue();
    }

    private static final Filter VoiceFiltersDialog$lambda$0$10(z0 z0Var) {
        return (Filter) z0Var.getValue();
    }

    private static final Filter VoiceFiltersDialog$lambda$0$13(z0 z0Var) {
        return (Filter) z0Var.getValue();
    }

    private static final Filter VoiceFiltersDialog$lambda$0$16(z0 z0Var) {
        return (Filter) z0Var.getValue();
    }

    public static final z VoiceFiltersDialog$lambda$0$19$0(AvailableFilters availableFilters, z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4, z0 z0Var5, z0 z0Var6, t1.t tVar) {
        List<Filter> list;
        Set set;
        List<Filter> list2;
        List<Filter> list3;
        Set set2;
        List<Filter> list4;
        List<Filter> list5;
        Set set3;
        tVar.getClass();
        int i10 = R.string.voices_filters_sort_by;
        List<Filter> list6 = null;
        if (availableFilters != null) {
            list = availableFilters.getSort();
        } else {
            list = null;
        }
        Filter VoiceFiltersDialog$lambda$0$1 = VoiceFiltersDialog$lambda$0$1(z0Var);
        Set set4 = v.f33549a;
        if (VoiceFiltersDialog$lambda$0$1 != null) {
            set = kd.a.T(VoiceFiltersDialog$lambda$0$1);
        } else {
            set = set4;
        }
        filterChips(tVar, i10, list, set, new s(z0Var, 0));
        int i11 = R.string.voices_filters_languages;
        if (availableFilters != null) {
            list2 = availableFilters.getLanguage();
        } else {
            list2 = null;
        }
        filterSelect(tVar, i11, list2, VoiceFiltersDialog$lambda$0$13(z0Var2), new s(z0Var2, 1), ComposableSingletons$VoiceFiltersDialogKt.INSTANCE.getLambda$1340528260$app_productionRelease());
        int i12 = R.string.voice_filters_accent;
        if (availableFilters != null) {
            list3 = availableFilters.getAccents();
        } else {
            list3 = null;
        }
        Filter VoiceFiltersDialog$lambda$0$16 = VoiceFiltersDialog$lambda$0$16(z0Var3);
        if (VoiceFiltersDialog$lambda$0$16 != null) {
            set2 = kd.a.T(VoiceFiltersDialog$lambda$0$16);
        } else {
            set2 = set4;
        }
        filterChips(tVar, i12, list3, set2, new s(z0Var3, 2));
        int i13 = R.string.voice_filters_best_for;
        if (availableFilters != null) {
            list4 = availableFilters.getUseCase();
        } else {
            list4 = null;
        }
        filterChips(tVar, i13, list4, VoiceFiltersDialog$lambda$0$4(z0Var4), new s(z0Var4, 3));
        int i14 = R.string.voices_filters_age;
        if (availableFilters != null) {
            list5 = availableFilters.getAge();
        } else {
            list5 = null;
        }
        Filter VoiceFiltersDialog$lambda$0$7 = VoiceFiltersDialog$lambda$0$7(z0Var5);
        if (VoiceFiltersDialog$lambda$0$7 != null) {
            set3 = kd.a.T(VoiceFiltersDialog$lambda$0$7);
        } else {
            set3 = set4;
        }
        filterChips(tVar, i14, list5, set3, new s(z0Var5, 4));
        int i15 = R.string.voices_filters_gender;
        if (availableFilters != null) {
            list6 = availableFilters.getGender();
        }
        Filter VoiceFiltersDialog$lambda$0$10 = VoiceFiltersDialog$lambda$0$10(z0Var6);
        if (VoiceFiltersDialog$lambda$0$10 != null) {
            set4 = kd.a.T(VoiceFiltersDialog$lambda$0$10);
        }
        filterChips(tVar, i15, list6, set4, new s(z0Var6, 5));
        return z.f31622a;
    }

    public static final z VoiceFiltersDialog$lambda$0$19$0$0(z0 z0Var, Filter filter) {
        filter.getClass();
        if (filter.equals(VoiceFiltersDialog$lambda$0$1(z0Var))) {
            filter = null;
        }
        z0Var.setValue(filter);
        return z.f31622a;
    }

    public static final z VoiceFiltersDialog$lambda$0$19$0$1(z0 z0Var, Filter filter) {
        if (kotlin.jvm.internal.m.c(filter, VoiceFiltersDialog$lambda$0$13(z0Var))) {
            filter = null;
        }
        z0Var.setValue(filter);
        return z.f31622a;
    }

    public static final z VoiceFiltersDialog$lambda$0$19$0$2(z0 z0Var, Filter filter) {
        filter.getClass();
        if (filter.equals(VoiceFiltersDialog$lambda$0$16(z0Var))) {
            filter = null;
        }
        z0Var.setValue(filter);
        return z.f31622a;
    }

    public static final z VoiceFiltersDialog$lambda$0$19$0$3(z0 z0Var, Filter filter) {
        LinkedHashSet O;
        filter.getClass();
        if (VoiceFiltersDialog$lambda$0$4(z0Var).contains(filter)) {
            O = kd.a.K(VoiceFiltersDialog$lambda$0$4(z0Var), filter);
        } else {
            O = kd.a.O(VoiceFiltersDialog$lambda$0$4(z0Var), filter);
        }
        z0Var.setValue(O);
        return z.f31622a;
    }

    public static final z VoiceFiltersDialog$lambda$0$19$0$4(z0 z0Var, Filter filter) {
        filter.getClass();
        if (filter.equals(VoiceFiltersDialog$lambda$0$7(z0Var))) {
            filter = null;
        }
        z0Var.setValue(filter);
        return z.f31622a;
    }

    public static final z VoiceFiltersDialog$lambda$0$19$0$5(z0 z0Var, Filter filter) {
        filter.getClass();
        if (filter.equals(VoiceFiltersDialog$lambda$0$10(z0Var))) {
            filter = null;
        }
        z0Var.setValue(filter);
        return z.f31622a;
    }

    public static final z VoiceFiltersDialog$lambda$0$20$0$0$0(z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4, z0 z0Var5, z0 z0Var6) {
        z0Var.setValue(null);
        z0Var2.setValue(v.f33549a);
        z0Var3.setValue(null);
        z0Var4.setValue(null);
        z0Var5.setValue(null);
        z0Var6.setValue(null);
        return z.f31622a;
    }

    public static final z VoiceFiltersDialog$lambda$0$20$0$1$0(ho.l lVar, ho.a aVar, z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4, z0 z0Var5, z0 z0Var6) {
        Filter VoiceFiltersDialog$lambda$0$1 = VoiceFiltersDialog$lambda$0$1(z0Var);
        Set<Filter> VoiceFiltersDialog$lambda$0$4 = VoiceFiltersDialog$lambda$0$4(z0Var2);
        if (VoiceFiltersDialog$lambda$0$4.isEmpty()) {
            VoiceFiltersDialog$lambda$0$4 = null;
        }
        Set<Filter> set = VoiceFiltersDialog$lambda$0$4;
        lVar.invoke(new SelectFiltersEvent(VoiceFiltersDialog$lambda$0$1, VoiceFiltersDialog$lambda$0$16(z0Var6), set, VoiceFiltersDialog$lambda$0$7(z0Var3), VoiceFiltersDialog$lambda$0$10(z0Var4), VoiceFiltersDialog$lambda$0$13(z0Var5)));
        aVar.invoke();
        return z.f31622a;
    }

    private static final Set<Filter> VoiceFiltersDialog$lambda$0$4(z0 z0Var) {
        return (Set) z0Var.getValue();
    }

    private static final Filter VoiceFiltersDialog$lambda$0$7(z0 z0Var) {
        return (Filter) z0Var.getValue();
    }

    public static final z VoiceFiltersDialog$lambda$1(FiltersState filtersState, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        VoiceFiltersDialog(filtersState, lVar, aVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void filterChips(t1.t tVar, int i10, List<? extends Filter> list, Set<? extends Filter> set, ho.l lVar) {
        if (list != null && !list.isEmpty()) {
            t1.t.c(tVar, null, null, new c3.j(new e1(i10, list, set, lVar), true, -813447739), 3);
        }
    }

    public static final z filterChips$lambda$0(int i10, List list, Set set, ho.l lVar, t1.b bVar, u2.m mVar, int i11) {
        boolean z6;
        bVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i12 = ElevenLabsTheme.$stable;
            float m2356getX4D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i12).m2356getX4D9Ej5fM();
            i3.q qVar2 = i3.q.f13017a;
            i3.t I = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, m2356getX4D9Ej5fM, 7);
            u0 u0Var = r1.j.f29228a;
            x a10 = w.a(ib.i.n(elevenLabsTheme, qVar, i12), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(I, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            j7.d(kj.c.R(qVar, i10), r1.d.G(qVar2, elevenLabsTheme.getSpacings(qVar, i12).m2356getX4D9Ej5fM(), t2.u.P, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i12).getPill700(), qVar, 0, 0, 131068);
            ChipGroupKt.ChipFlowGroup(c3.k.d(-477254677, true, new fm.o(list, set, lVar, 29), qVar), qVar, 6);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z filterChips$lambda$0$0$0(List list, Set set, ho.l lVar, v0 v0Var, u2.m mVar, int i10) {
        boolean z6;
        v0Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Filter filter = (Filter) it.next();
                boolean contains = set.contains(filter);
                String description = filter.getDescription();
                boolean f10 = qVar.f(lVar) | qVar.h(filter);
                Object L = qVar.L();
                if (f10 || L == u2.l.f33918a) {
                    L = new c(lVar, filter, 2);
                    qVar.h0(L);
                }
                ChipKt.Chip(description, null, contains, null, null, null, (ho.a) L, null, null, qVar, 0, 442);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z filterChips$lambda$0$0$0$0$0(ho.l lVar, Filter filter) {
        lVar.invoke(filter);
        return z.f31622a;
    }

    private static final void filterSelect(t1.t tVar, final int i10, final List<? extends Filter> list, final Filter filter, final ho.l lVar, final ho.q qVar) {
        if (list != null && !list.isEmpty()) {
            t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.r
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z filterSelect$lambda$0;
                    int intValue = ((Integer) obj3).intValue();
                    filterSelect$lambda$0 = VoiceFiltersDialogKt.filterSelect$lambda$0(i10, filter, list, qVar, lVar, (t1.b) obj, (u2.m) obj2, intValue);
                    return filterSelect$lambda$0;
                }
            }, true, -1277458736), 3);
        }
    }

    public static final z filterSelect$lambda$0(int i10, final Filter filter, List list, final ho.q qVar, ho.l lVar, t1.b bVar, u2.m mVar, int i11) {
        boolean z6;
        String str;
        bVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = u2.r.A(Boolean.FALSE);
                qVar2.h0(L);
            }
            z0 z0Var = (z0) L;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i12 = ElevenLabsTheme.$stable;
            float m2356getX4D9Ej5fM = elevenLabsTheme.getSpacings(qVar2, i12).m2356getX4D9Ej5fM();
            i3.q qVar3 = i3.q.f13017a;
            i3.t I = r1.d.I(qVar3, t2.u.P, t2.u.P, t2.u.P, m2356getX4D9Ej5fM, 7);
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(I, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            j7.d(kj.c.R(qVar2, i10), r1.d.G(qVar3, elevenLabsTheme.getSpacings(qVar2, i12).m2356getX4D9Ej5fM(), t2.u.P, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i12).getPill700(), qVar2, 0, 0, 131068);
            if (filter != null) {
                str = filter.getDescription();
            } else {
                str = null;
            }
            if (str == null) {
                qVar2.X(-406668492);
                str = kj.c.R(qVar2, R.string.voices_filters_filter_by_language);
            } else {
                qVar2.X(-406670011);
            }
            qVar2.p(false);
            i3.t E = r1.d.E(qVar3, elevenLabsTheme.getSpacings(qVar2, i12).m2356getX4D9Ej5fM());
            String valueOf = String.valueOf(list.size());
            Object L2 = qVar2.L();
            if (L2 == eVar) {
                L2 = new n(z0Var, 1);
                qVar2.h0(L2);
            }
            SelectKt.Select(str, E, (ho.a) L2, c3.k.d(-378216434, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.t
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z filterSelect$lambda$0$3$1;
                    int intValue = ((Integer) obj2).intValue();
                    filterSelect$lambda$0$3$1 = VoiceFiltersDialogKt.filterSelect$lambda$0$3$1(Filter.this, qVar, (u2.m) obj, intValue);
                    return filterSelect$lambda$0$3$1;
                }
            }, qVar2), 0, valueOf, qVar2, 3456, 16);
            qVar2.p(true);
            if (filterSelect$lambda$0$1(z0Var)) {
                qVar2.X(933284959);
                Object L3 = qVar2.L();
                if (L3 == eVar) {
                    L3 = new n(z0Var, 2);
                    qVar2.h0(L3);
                }
                BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, (ho.a) L3, kj.c.R(qVar2, i10), (ho.r) c3.k.d(1410341923, true, new io.elevenlabs.readerapp.core.router.g(list, lVar, qVar, filter, 6), qVar2), (u2.m) qVar2, 1597446, 14);
                qVar2.p(false);
            } else {
                qVar2.X(937854514);
                qVar2.p(false);
            }
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    private static final boolean filterSelect$lambda$0$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void filterSelect$lambda$0$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z filterSelect$lambda$0$3$0$0(z0 z0Var) {
        filterSelect$lambda$0$2(z0Var, !filterSelect$lambda$0$1(z0Var));
        return z.f31622a;
    }

    public static final z filterSelect$lambda$0$3$1(Filter filter, ho.q qVar, u2.m mVar, int i10) {
        boolean z6;
        z zVar;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        boolean O = qVar2.O(i10 & 1, z6);
        z zVar2 = z.f31622a;
        if (O) {
            if (filter == null) {
                qVar2.X(-1746531398);
                qVar2.p(false);
                zVar = null;
            } else {
                qVar2.X(-1746531397);
                qVar.invoke(filter, qVar2, 0);
                qVar2.p(false);
                zVar = zVar2;
            }
            if (zVar == null) {
                qVar2.X(-1746494817);
                y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.world, qVar2, 0), null, p2.o(i3.q.f13017a, 20), defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar2, ElevenLabsTheme.$stable), qVar2, u3.c.$stable | 432, 0);
                qVar2.p(false);
                return zVar2;
            }
            qVar2.X(1606228110);
            qVar2.p(false);
            return zVar2;
        }
        qVar2.R();
        return zVar2;
    }

    public static final z filterSelect$lambda$0$4$0(z0 z0Var) {
        filterSelect$lambda$0$2(z0Var, false);
        return z.f31622a;
    }

    public static final z filterSelect$lambda$0$5(List list, ho.l lVar, ho.q qVar, final Filter filter, y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar2 = (u2.q) mVar;
        Object L = qVar2.L();
        Object obj = u2.l.f33918a;
        if (L == obj) {
            L = u2.r.A("");
            qVar2.h0(L);
        }
        z0 z0Var = (z0) L;
        boolean f10 = qVar2.f(filterSelect$lambda$0$5$1(z0Var)) | qVar2.f(list);
        Object L2 = qVar2.L();
        if (f10 || L2 == obj) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Filter filter2 = (Filter) obj2;
                if (wq.n.a0(filter2.getDescription(), filterSelect$lambda$0$5$1(z0Var), true) || wq.n.a0(filter2.getKey(), filterSelect$lambda$0$5$1(z0Var), true)) {
                    arrayList.add(obj2);
                }
            }
            L2 = tn.o.a1(new Comparator() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceFiltersDialogKt$filterSelect$lambda$0$5$3$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    String str;
                    boolean z6;
                    String key = ((Filter) t11).getKey();
                    Filter filter3 = Filter.this;
                    String str2 = null;
                    if (filter3 != null) {
                        str = filter3.getKey();
                    } else {
                        str = null;
                    }
                    boolean z10 = false;
                    if (key == str) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z6);
                    String key2 = ((Filter) t10).getKey();
                    Filter filter4 = Filter.this;
                    if (filter4 != null) {
                        str2 = filter4.getKey();
                    }
                    if (key2 == str2) {
                        z10 = true;
                    }
                    return wn.e.g(valueOf, Boolean.valueOf(z10));
                }
            }, arrayList);
            qVar2.h0(L2);
        }
        List list2 = (List) L2;
        i3.t d10 = p2.d(i3.q.f13017a, 1.0f);
        d2 d11 = r1.d.d(t2.u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar2, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM(), 1);
        boolean h10 = qVar2.h(list2) | qVar2.f(lVar) | qVar2.h(bottomSheetControl) | qVar2.f(qVar) | qVar2.h(filter);
        Object L3 = qVar2.L();
        if (h10 || L3 == obj) {
            Object c0Var = new c0(list2, z0Var, lVar, bottomSheetControl, filter, qVar);
            qVar2.h0(c0Var);
            L3 = c0Var;
        }
        c1.c(d10, null, d11, false, null, null, null, false, null, (ho.l) L3, qVar2, 6, 506);
        return z.f31622a;
    }

    private static final String filterSelect$lambda$0$5$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z filterSelect$lambda$0$5$4$0(final List list, z0 z0Var, final ho.l lVar, final BottomSheetControl bottomSheetControl, final Filter filter, final ho.q qVar, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new h(z0Var, 2), true, -1045266568), 3);
        final VoiceFiltersDialogKt$filterSelect$lambda$0$5$4$0$$inlined$items$default$1 voiceFiltersDialogKt$filterSelect$lambda$0$5$4$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceFiltersDialogKt$filterSelect$lambda$0$5$4$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Filter) obj);
            }

            @Override // ho.l
            public final Void invoke(Filter filter2) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceFiltersDialogKt$filterSelect$lambda$0$5$4$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceFiltersDialogKt$filterSelect$lambda$0$5$4$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((u2.q) mVar).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar2 = (u2.q) mVar;
                if (qVar2.O(i12 & 1, z6)) {
                    final Filter filter2 = (Filter) list.get(i10);
                    qVar2.X(-2020059499);
                    String description = filter2.getDescription();
                    boolean f10 = qVar2.f(lVar) | qVar2.h(filter2) | qVar2.h(bottomSheetControl);
                    Object L = qVar2.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar2 = lVar;
                        final BottomSheetControl bottomSheetControl2 = bottomSheetControl;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceFiltersDialogKt$filterSelect$1$3$1$1$2$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1750invoke() {
                                ho.l.this.invoke(filter2);
                                bottomSheetControl2.close();
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1750invoke();
                                return z.f31622a;
                            }
                        };
                        qVar2.h0(L);
                    }
                    ho.a aVar = (ho.a) L;
                    final Filter filter3 = filter;
                    final ho.q qVar3 = qVar;
                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(description, aVar, null, 0L, false, 0, null, false, null, c3.k.d(1361550366, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceFiltersDialogKt$filterSelect$1$3$1$1$2$2
                        public final void invoke(r1.s sVar, u2.m mVar2, int i15) {
                            boolean z10;
                            float f11;
                            float f12;
                            sVar.getClass();
                            if ((i15 & 17) != 16) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u2.q qVar4 = (u2.q) mVar2;
                            if (qVar4.O(i15 & 1, z10)) {
                                i3.q qVar5 = i3.q.f13017a;
                                i3.t e10 = p2.e(qVar5, 1.0f);
                                Filter filter4 = Filter.this;
                                Filter filter5 = filter3;
                                ho.q qVar6 = qVar3;
                                x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar4, 0);
                                int hashCode = Long.hashCode(qVar4.T);
                                c3.o l4 = qVar4.l();
                                i3.t c5 = i3.a.c(e10, qVar4);
                                h4.h.f11920i.getClass();
                                h4.f fVar = h4.g.f11903b;
                                qVar4.b0();
                                if (qVar4.S) {
                                    qVar4.k(fVar);
                                } else {
                                    qVar4.k0();
                                }
                                h4.e eVar = h4.g.f11907f;
                                u2.r.J(eVar, a10, qVar4);
                                h4.e eVar2 = h4.g.f11906e;
                                u2.r.J(eVar2, l4, qVar4);
                                Integer valueOf = Integer.valueOf(hashCode);
                                h4.e eVar3 = h4.g.f11908g;
                                u2.r.y(qVar4, valueOf, eVar3);
                                h4.d dVar = h4.g.f11909h;
                                u2.r.F(dVar, qVar4);
                                h4.e eVar4 = h4.g.f11905d;
                                u2.r.J(eVar4, c5, qVar4);
                                i3.t e11 = p2.e(qVar5, 1.0f);
                                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                                int i16 = ElevenLabsTheme.$stable;
                                i3.t f13 = ib.i.f(elevenLabsTheme, qVar4, i16, e11);
                                k2 a11 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar4, 48);
                                int hashCode2 = Long.hashCode(qVar4.T);
                                c3.o l7 = qVar4.l();
                                i3.t c10 = i3.a.c(f13, qVar4);
                                qVar4.b0();
                                if (qVar4.S) {
                                    qVar4.k(fVar);
                                } else {
                                    qVar4.k0();
                                }
                                u2.r.J(eVar, a11, qVar4);
                                u2.r.J(eVar2, l7, qVar4);
                                defpackage.f.u(hashCode2, qVar4, eVar3, qVar4, dVar);
                                u2.r.J(eVar4, c10, qVar4);
                                i3.t E = r1.d.E(qVar5, elevenLabsTheme.getSpacings(qVar4, i16).m2353getX2D9Ej5fM());
                                f1 d10 = r1.p.d(i3.d.f13001e, false);
                                int hashCode3 = Long.hashCode(qVar4.T);
                                c3.o l10 = qVar4.l();
                                i3.t c11 = i3.a.c(E, qVar4);
                                qVar4.b0();
                                if (qVar4.S) {
                                    qVar4.k(fVar);
                                } else {
                                    qVar4.k0();
                                }
                                u2.r.J(eVar, d10, qVar4);
                                u2.r.J(eVar2, l10, qVar4);
                                defpackage.f.u(hashCode3, qVar4, eVar3, qVar4, dVar);
                                u2.r.J(eVar4, c11, qVar4);
                                qVar6.invoke(filter4, qVar4, 0);
                                qVar4.p(true);
                                r1.d.g(p2.s(qVar5, elevenLabsTheme.getSpacings(qVar4, i16).m2353getX2D9Ej5fM()), qVar4);
                                String description2 = filter4.getDescription();
                                y0 pill700 = elevenLabsTheme.getTypo(qVar4, i16).getPill700();
                                if (1.0f <= 0.0d) {
                                    s1.a.a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f11 = Float.MAX_VALUE;
                                } else {
                                    f11 = 1.0f;
                                }
                                j7.d(description2, new m1(f11, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, pill700, qVar4, 0, 24960, 110588);
                                if (filter4.equals(filter5)) {
                                    qVar4.X(1862029052);
                                    if (1.0f <= 0.0d) {
                                        s1.a.a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f12 = Float.MAX_VALUE;
                                    } else {
                                        f12 = 1.0f;
                                    }
                                    r1.d.g(new m1(f12, true), qVar4);
                                    y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.check, qVar4, 0), null, null, defpackage.f.b(elevenLabsTheme, qVar4, i16), qVar4, u3.c.$stable | 48, 4);
                                    qVar4.p(false);
                                } else {
                                    qVar4.X(1862461502);
                                    qVar4.p(false);
                                }
                                qVar4.p(true);
                                r1.d.g(l1.n.h(r1.d.G(p2.e(p2.f(qVar5, 1), 1.0f), elevenLabsTheme.getSpacings(qVar4, i16).m2357getX5D9Ej5fM(), t2.u.P, 2), elevenLabsTheme.getColor(qVar4, i16).getDivider().m2059getLine0d7_KjU(), h0.f26395b), qVar4);
                                qVar4.p(true);
                                return;
                            }
                            qVar4.R();
                        }

                        @Override // ho.q
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((r1.s) obj, (u2.m) obj2, ((Number) obj3).intValue());
                            return z.f31622a;
                        }
                    }, qVar2), qVar2, 805306368, 508);
                    qVar2.p(false);
                    return;
                }
                qVar2.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
        t1.t.c(tVar, null, null, ComposableSingletons$VoiceFiltersDialogKt.INSTANCE.getLambda$37332271$app_productionRelease(), 3);
        return z.f31622a;
    }

    public static final z filterSelect$lambda$0$5$4$0$0(z0 z0Var, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            i3.t I = r1.d.I(r1.d.G(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM(), t2.u.P, 2), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM(), 7);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(I, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            String filterSelect$lambda$0$5$1 = filterSelect$lambda$0$5$1(z0Var);
            String R = kj.c.R(qVar, R.string.voices_filters_search);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new s(z0Var, 6);
                qVar.h0(L);
            }
            InputKt.Input(filterSelect$lambda$0$5$1, (ho.l) L, (i3.t) null, (i3.t) null, (InputState) null, (String) null, (String) null, R, ComposableSingletons$VoiceFiltersDialogKt.INSTANCE.m1749getLambda$1473319083$app_productionRelease(), (a2) null, (z1) null, (d0) null, false, 0, (u2.m) qVar, 100663344, 0, 15996);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z filterSelect$lambda$0$5$4$0$0$0$0$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return z.f31622a;
    }
}
