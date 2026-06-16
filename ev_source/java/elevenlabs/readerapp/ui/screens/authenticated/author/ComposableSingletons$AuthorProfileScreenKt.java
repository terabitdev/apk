package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import a7.u;
import f4.f1;
import ho.q;
import i3.t;
import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt;
import io.elevenlabs.readerapp.ui.previews.AuthorProfileFactoryKt;
import io.elevenlabs.ui.components.LoaderKt;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import sn.z;
import ta.z0;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AuthorProfileScreenKt {
    public static final ComposableSingletons$AuthorProfileScreenKt INSTANCE = new ComposableSingletons$AuthorProfileScreenKt();

    /* renamed from: lambda$-690191985 */
    private static ho.p f269lambda$690191985 = new c3.j(new o(8), false, -690191985);

    /* renamed from: lambda$-713021463 */
    private static ho.p f270lambda$713021463 = new c3.j(new o(11), false, -713021463);
    private static q lambda$443301901 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(4), false, 443301901);
    private static q lambda$28254316 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(3), false, 28254316);

    /* renamed from: lambda$-207369576 */
    private static ho.p f267lambda$207369576 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.c(24), false, -207369576);

    /* renamed from: lambda$-990775964 */
    private static ho.p f272lambda$990775964 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.c(25), false, -990775964);

    /* renamed from: lambda$-940654112 */
    private static ho.p f271lambda$940654112 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.c(26), false, -940654112);
    private static ho.p lambda$710126524 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.c(27), false, 710126524);

    /* renamed from: lambda$-57815323 */
    private static ho.p f268lambda$57815323 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.c(28), false, -57815323);

    /* renamed from: lambda$-1917779503 */
    private static ho.p f266lambda$1917779503 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.c(29), false, -1917779503);
    private static ho.p lambda$1673709288 = new c3.j(new o(9), false, 1673709288);
    private static ho.p lambda$885728468 = new c3.j(new o(10), false, 885728468);

    public static final z lambda_1673709288$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileState authorProfileState = new AuthorProfileState("1", AuthorProfileFactoryKt.stubAuthorMinimal(), false, false, null, null, null, 124, null);
            ua.b rememberPreviewLazyPagingItems = ComposeExtensionsKt.rememberPreviewLazyPagingItems(new z0(new u(new ta.z(null), 3), z0.f32777e, z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(29);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(13);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new o(4);
                qVar.h0(L3);
            }
            ho.p pVar = (ho.p) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new f(14);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new f(15);
                qVar.h0(L5);
            }
            AuthorProfileScreenKt.AuthorProfileScreenUi(authorProfileState, rememberPreviewLazyPagingItems, aVar, lVar, pVar, lVar2, (ho.l) L5, null, qVar, 1797568, 128);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1673709288$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_1673709288$lambda$0$2$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return z.f31622a;
    }

    public static final z lambda_1673709288$lambda$0$3$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda_1673709288$lambda$0$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_28254316$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t E = r1.d.E(p2.e(i3.q.f13017a, 1.0f), 16);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_443301901$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t E = r1.d.E(p2.e(i3.q.f13017a, 1.0f), 32);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_710126524$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileState authorProfileState = new AuthorProfileState("1", AuthorProfile.copy$default(AuthorProfileFactoryKt.stubAuthorWithSubpages(), null, null, false, 3, null), false, false, null, new SelectedSubpage("1", 0), null, 92, null);
            List H = ig.f.H(AuthorProfileFactoryKt.stubReadSection());
            ua.b rememberPreviewLazyPagingItems = ComposeExtensionsKt.rememberPreviewLazyPagingItems(new z0(new u(new ta.z(H, null), 3), z0.f32777e, z0.f32778f, new io.elevenlabs.readerapp.ui.components.e(H, 6)), qVar, 0);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(25);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(4);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new o(3);
                qVar.h0(L3);
            }
            ho.p pVar = (ho.p) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new f(17);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new f(24);
                qVar.h0(L5);
            }
            AuthorProfileScreenKt.AuthorProfileScreenUi(authorProfileState, rememberPreviewLazyPagingItems, aVar, lVar, pVar, lVar2, (ho.l) L5, null, qVar, 1797568, 128);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_710126524$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_710126524$lambda$0$2$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return z.f31622a;
    }

    public static final z lambda_710126524$lambda$0$3$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda_710126524$lambda$0$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_885728468$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileState authorProfileState = new AuthorProfileState("1", new AuthorProfile(ig.f.I(AuthorProfileFactoryKt.stubAuthorHeader(), AuthorProfileFactoryKt.stubAuthorActions$default(false, 1, null)), tn.t.f33547a, true), false, false, null, null, null, 124, null);
            ua.b rememberPreviewLazyPagingItems = ComposeExtensionsKt.rememberPreviewLazyPagingItems(new z0(new u(new ta.z(null), 3), z0.f32777e, z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(27);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(7);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new o(1);
                qVar.h0(L3);
            }
            ho.p pVar = (ho.p) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new f(8);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new f(9);
                qVar.h0(L5);
            }
            AuthorProfileScreenKt.AuthorProfileScreenUi(authorProfileState, rememberPreviewLazyPagingItems, aVar, lVar, pVar, lVar2, (ho.l) L5, null, qVar, 1797568, 128);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_885728468$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_885728468$lambda$0$2$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return z.f31622a;
    }

    public static final z lambda_885728468$lambda$0$3$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda_885728468$lambda$0$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__1917779503$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileState authorProfileState = new AuthorProfileState("1", AuthorProfileFactoryKt.stubAuthorWithSubpages(), false, false, null, new SelectedSubpage("1", 0), null, 92, null);
            ta.t tVar = new ta.t(ta.r.f32704b, new rq.f(false), new rq.f(false));
            ua.b rememberPreviewLazyPagingItems = ComposeExtensionsKt.rememberPreviewLazyPagingItems(new z0(new u(new ta.z(tVar), 3), z0.f32777e, z0.f32778f, new qa.g(tVar, 9)), qVar, 0);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(28);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(10);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new o(2);
                qVar.h0(L3);
            }
            ho.p pVar = (ho.p) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new f(11);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new f(12);
                qVar.h0(L5);
            }
            AuthorProfileScreenKt.AuthorProfileScreenUi(authorProfileState, rememberPreviewLazyPagingItems, aVar, lVar, pVar, lVar2, (ho.l) L5, null, qVar, 1797568, 128);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1917779503$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__1917779503$lambda$0$2$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return z.f31622a;
    }

    public static final z lambda__1917779503$lambda$0$3$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda__1917779503$lambda$0$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__207369576$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileState authorProfileState = new AuthorProfileState("1", null, true, false, null, null, null, 122, null);
            ua.b rememberPreviewLazyPagingItems = ComposeExtensionsKt.rememberPreviewLazyPagingItems(new z0(new u(new ta.z(null), 3), z0.f32777e, z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new p(0);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(16);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new o(5);
                qVar.h0(L3);
            }
            ho.p pVar = (ho.p) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new f(18);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new f(19);
                qVar.h0(L5);
            }
            AuthorProfileScreenKt.AuthorProfileScreenUi(authorProfileState, rememberPreviewLazyPagingItems, aVar, lVar, pVar, lVar2, (ho.l) L5, null, qVar, 1797568, 128);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__207369576$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__207369576$lambda$0$2$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return z.f31622a;
    }

    public static final z lambda__207369576$lambda$0$3$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda__207369576$lambda$0$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__57815323$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileState authorProfileState = new AuthorProfileState("1", AuthorProfileFactoryKt.stubAuthorWithSubpages(), false, false, null, new SelectedSubpage("asdf", 1), null, 92, null);
            List I = ig.f.I(AuthorProfileFactoryKt.stubSeriesSection(), AuthorProfileFactoryKt.stubFantasySeriesSection());
            ua.b rememberPreviewLazyPagingItems = ComposeExtensionsKt.rememberPreviewLazyPagingItems(new z0(new u(new ta.z(I, null), 3), z0.f32777e, z0.f32778f, new io.elevenlabs.readerapp.ui.components.e(I, 6)), qVar, 0);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(26);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(3);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new o(0);
                qVar.h0(L3);
            }
            ho.p pVar = (ho.p) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new f(5);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new f(6);
                qVar.h0(L5);
            }
            AuthorProfileScreenKt.AuthorProfileScreenUi(authorProfileState, rememberPreviewLazyPagingItems, aVar, lVar, pVar, lVar2, (ho.l) L5, null, qVar, 1797568, 128);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__57815323$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__57815323$lambda$0$2$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return z.f31622a;
    }

    public static final z lambda__57815323$lambda$0$3$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda__57815323$lambda$0$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__690191985$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__713021463$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__940654112$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileState authorProfileState = new AuthorProfileState("1", AuthorProfileFactoryKt.stubAuthorWithBooks(), false, false, null, null, null, 124, null);
            ua.b rememberPreviewLazyPagingItems = ComposeExtensionsKt.rememberPreviewLazyPagingItems(new z0(new u(new ta.z(null), 3), z0.f32777e, z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new p(2);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(23);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new o(7);
                qVar.h0(L3);
            }
            ho.p pVar = (ho.p) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new f(25);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new f(26);
                qVar.h0(L5);
            }
            AuthorProfileScreenKt.AuthorProfileScreenUi(authorProfileState, rememberPreviewLazyPagingItems, aVar, lVar, pVar, lVar2, (ho.l) L5, null, qVar, 1797568, 128);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__940654112$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__940654112$lambda$0$2$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return z.f31622a;
    }

    public static final z lambda__940654112$lambda$0$3$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda__940654112$lambda$0$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__990775964$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileState authorProfileState = new AuthorProfileState("1", null, false, false, kj.c.R(qVar, R.string.error_network_error), null, null, 110, null);
            ua.b rememberPreviewLazyPagingItems = ComposeExtensionsKt.rememberPreviewLazyPagingItems(new z0(new u(new ta.z(null), 3), z0.f32777e, z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new p(1);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(20);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new o(6);
                qVar.h0(L3);
            }
            ho.p pVar = (ho.p) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new f(21);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new f(22);
                qVar.h0(L5);
            }
            AuthorProfileScreenKt.AuthorProfileScreenUi(authorProfileState, rememberPreviewLazyPagingItems, aVar, lVar, pVar, lVar2, (ho.l) L5, null, qVar, 1797568, 128);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__990775964$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__990775964$lambda$0$2$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return z.f31622a;
    }

    public static final z lambda__990775964$lambda$0$3$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda__990775964$lambda$0$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1917779503$app_productionRelease */
    public final ho.p m1303getLambda$1917779503$app_productionRelease() {
        return f266lambda$1917779503;
    }

    /* renamed from: getLambda$-207369576$app_productionRelease */
    public final ho.p m1304getLambda$207369576$app_productionRelease() {
        return f267lambda$207369576;
    }

    /* renamed from: getLambda$-57815323$app_productionRelease */
    public final ho.p m1305getLambda$57815323$app_productionRelease() {
        return f268lambda$57815323;
    }

    /* renamed from: getLambda$-690191985$app_productionRelease */
    public final ho.p m1306getLambda$690191985$app_productionRelease() {
        return f269lambda$690191985;
    }

    /* renamed from: getLambda$-713021463$app_productionRelease */
    public final ho.p m1307getLambda$713021463$app_productionRelease() {
        return f270lambda$713021463;
    }

    /* renamed from: getLambda$-940654112$app_productionRelease */
    public final ho.p m1308getLambda$940654112$app_productionRelease() {
        return f271lambda$940654112;
    }

    /* renamed from: getLambda$-990775964$app_productionRelease */
    public final ho.p m1309getLambda$990775964$app_productionRelease() {
        return f272lambda$990775964;
    }

    public final ho.p getLambda$1673709288$app_productionRelease() {
        return lambda$1673709288;
    }

    public final q getLambda$28254316$app_productionRelease() {
        return lambda$28254316;
    }

    public final q getLambda$443301901$app_productionRelease() {
        return lambda$443301901;
    }

    public final ho.p getLambda$710126524$app_productionRelease() {
        return lambda$710126524;
    }

    public final ho.p getLambda$885728468$app_productionRelease() {
        return lambda$885728468;
    }
}
