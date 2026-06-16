package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import a2.k3;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import i3.t;
import i4.j1;
import i4.q2;
import io.elevenlabs.domain.model.AccountPage;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.c1;
import io.elevenlabs.ui.components.ActionRowItemKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import tn.p;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u0007\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"", "title", "", "Lio/elevenlabs/domain/model/AccountPage$Section$HelpfulResourcesV2$Item;", FirebaseAnalytics.Param.ITEMS, "Lsn/z;", "AccountHelpfulResourcesSection", "(Ljava/lang/String;Ljava/util/List;Lu2/m;I)V", "Lio/elevenlabs/domain/model/AccountPage$Section$TermsAndConditions$Item;", "Lkotlin/Function0;", "onNavigateLicenses", "AccountTermsAndConditionsSection", "(Ljava/lang/String;Ljava/util/List;Lho/a;Lu2/m;I)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/components/SectionItem;", "RenderDynamicSection", "iconName", "", "mapIconNameToDrawable", "(Ljava/lang/String;)Ljava/lang/Integer;", "Preview_AccountDynamicSection_HelpfulResources", "(Lu2/m;I)V", "Preview_AccountDynamicSection_TermsAndConditions", "Preview_AccountDynamicSection_NoIcons", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountDynamicSectionKt {
    public static final void AccountHelpfulResourcesSection(String str, List<AccountPage.Section.HelpfulResourcesV2.Item> list, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        str.getClass();
        list.getClass();
        q qVar = (q) mVar;
        qVar.Z(-193930947);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(list)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ArrayList arrayList = new ArrayList(p.a0(list, 10));
            for (AccountPage.Section.HelpfulResourcesV2.Item item : list) {
                arrayList.add(new SectionItem(item.getTitle(), item.getUrl(), item.getIcon()));
            }
            RenderDynamicSection(str, arrayList, qVar, i11 & 14);
            r1.d.g(p2.f(qVar2, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX5()), qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(str, list, i10, 1);
        }
    }

    public static final z AccountHelpfulResourcesSection$lambda$1(String str, List list, int i10, m mVar, int i11) {
        AccountHelpfulResourcesSection(str, list, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void AccountTermsAndConditionsSection(String str, List<AccountPage.Section.TermsAndConditions.Item> list, ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        str.getClass();
        list.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-840516944);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(list)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ArrayList arrayList = new ArrayList(p.a0(list, 10));
            for (AccountPage.Section.TermsAndConditions.Item item : list) {
                arrayList.add(new SectionItem(item.getTitle(), item.getUrl(), item.getIcon()));
            }
            RenderDynamicSection(str, arrayList, qVar, i11 & 14);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            ib.i.o(echoTheme, qVar, i15, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.settings_licenses), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.book_filled), null, aVar, qVar, (i11 << 6) & 57344, 10);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i15).getX5()), qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 13, str, list, aVar);
        }
    }

    public static final z AccountTermsAndConditionsSection$lambda$1(String str, List list, ho.a aVar, int i10, m mVar, int i11) {
        AccountTermsAndConditionsSection(str, list, aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountDynamicSection_HelpfulResources(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1822549693);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AccountDynamicSectionKt.INSTANCE.getLambda$298092695$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 16);
        }
    }

    public static final z Preview_AccountDynamicSection_HelpfulResources$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountDynamicSection_HelpfulResources(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountDynamicSection_NoIcons(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-98851605);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AccountDynamicSectionKt.INSTANCE.getLambda$1460970961$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 18);
        }
    }

    public static final z Preview_AccountDynamicSection_NoIcons$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountDynamicSection_NoIcons(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountDynamicSection_TermsAndConditions(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1107935556);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AccountDynamicSectionKt.INSTANCE.m1238getLambda$1527262698$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 17);
        }
    }

    public static final z Preview_AccountDynamicSection_TermsAndConditions$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountDynamicSection_TermsAndConditions(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void RenderDynamicSection(String str, List<SectionItem> list, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        q qVar = (q) mVar;
        qVar.Z(1430989584);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(list)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            q2 q2Var = (q2) qVar.j(j1.f13138r);
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            AccountSectionDividerKt.AccountSectionDivider(str, qVar, i11 & 14, 0);
            qVar.X(1445420741);
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 >= 0) {
                    SectionItem sectionItem = (SectionItem) obj;
                    if (i14 > 0) {
                        qVar.X(2112032991);
                        ib.i.o(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, qVar2, qVar);
                        qVar.p(false);
                    } else {
                        qVar.X(2112107949);
                        qVar.p(false);
                    }
                    String title = sectionItem.getTitle();
                    Integer mapIconNameToDrawable = mapIconNameToDrawable(sectionItem.getIcon());
                    boolean h10 = qVar.h(q2Var) | qVar.f(sectionItem);
                    Object L = qVar.L();
                    if (h10 || L == l.f33918a) {
                        L = new c(q2Var, sectionItem, 0);
                        qVar.h0(L);
                    }
                    ActionRowItemKt.ActionRowItem(title, null, mapIconNameToDrawable, null, (ho.a) L, qVar, 0, 10);
                    i14 = i15;
                } else {
                    ig.f.U();
                    throw null;
                }
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(str, list, i10, 0);
        }
    }

    public static final z RenderDynamicSection$lambda$0$0$0$0(q2 q2Var, SectionItem sectionItem) {
        q2Var.openUri(sectionItem.getUrl());
        return z.f31622a;
    }

    public static final z RenderDynamicSection$lambda$1(String str, List list, int i10, m mVar, int i11) {
        RenderDynamicSection(str, list, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final Integer mapIconNameToDrawable(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1750558519:
                    if (str.equals("shield_keyhole")) {
                        return Integer.valueOf(io.elevenlabs.ui.R.drawable.shield_keyhole);
                    }
                    return null;
                case -1062660906:
                    if (str.equals("warning_triangle_filled")) {
                        return Integer.valueOf(io.elevenlabs.ui.R.drawable.warning_triangle_filled);
                    }
                    return null;
                case -618987246:
                    if (str.equals("warning_bubble_filled")) {
                        return Integer.valueOf(io.elevenlabs.ui.R.drawable.warning_bubble_filled);
                    }
                    return null;
                case -222740838:
                    if (str.equals("lifebelt_filled")) {
                        return Integer.valueOf(io.elevenlabs.ui.R.drawable.lifebelt_filled);
                    }
                    return null;
                case -173602952:
                    if (str.equals("book_filled")) {
                        return Integer.valueOf(io.elevenlabs.ui.R.drawable.book_filled);
                    }
                    return null;
                case 34815795:
                    if (str.equals("help_circle_filled")) {
                        return Integer.valueOf(io.elevenlabs.ui.R.drawable.help_circle_filled);
                    }
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }
}
