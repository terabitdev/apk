package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.BookPurchaseHistoryItem;
import io.elevenlabs.readerapp.ui.formatter.DateFormatterKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.MenuKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.l2;
import r1.p2;
import r1.u0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1 implements ho.q {
    final /* synthetic */ BookPurchaseHistoryItem $it;
    final /* synthetic */ ho.l $onNavigateToReadReturn;

    public BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1(BookPurchaseHistoryItem bookPurchaseHistoryItem, ho.l lVar) {
        this.$it = bookPurchaseHistoryItem;
        this.$onNavigateToReadReturn = lVar;
    }

    private static final boolean invoke$lambda$0$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public final void invoke(l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        h4.e eVar;
        z0 z0Var;
        u2.e eVar2;
        final z0 z0Var2;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            final String readId = this.$it.getReadId();
            u0 u0Var = r1.j.f29228a;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            r1.h n2 = ib.i.n(elevenLabsTheme, qVar, i11);
            i3.j jVar = i3.d.D0;
            BookPurchaseHistoryItem bookPurchaseHistoryItem = this.$it;
            final ho.l lVar = this.$onNavigateToReadReturn;
            r1.x a10 = r1.w.a(n2, jVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar3 = h4.g.f11907f;
            u2.r.J(eVar3, a10, qVar);
            h4.e eVar4 = h4.g.f11906e;
            u2.r.J(eVar4, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar5 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar5);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar6 = h4.g.f11905d;
            u2.r.J(eVar6, c5, qVar);
            j7.d(bookPurchaseHistoryItem.getPrice(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyLarge700(), qVar, 0, 0, 131070);
            u2.q qVar3 = qVar;
            Object L = qVar3.L();
            u2.e eVar7 = u2.l.f33918a;
            if (L == eVar7) {
                L = u2.r.A(Boolean.FALSE);
                qVar3.h0(L);
            }
            final z0 z0Var3 = (z0) L;
            if (bookPurchaseHistoryItem.isRefundable() && readId != null) {
                qVar3.X(1880503519);
                int i12 = R.drawable.dot_grid_1x3_horizontal;
                String R = kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.common_read_more);
                Object L2 = qVar3.L();
                if (L2 == eVar7) {
                    L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1$1$1$1
                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m1631invoke() {
                            BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1.invoke$lambda$0$2(z0.this, true);
                        }

                        @Override // ho.a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m1631invoke();
                            return sn.z.f31622a;
                        }
                    };
                    qVar3.h0(L2);
                }
                eVar = eVar6;
                z0Var = z0Var3;
                eVar2 = eVar7;
                ButtonIconKt.ButtonIcon(i12, R, (ho.a) L2, null, ButtonIconVariant.Transparent, ButtonIconSize.Small, false, false, false, qVar3, 221568, 456);
                qVar3 = qVar3;
                qVar3.p(false);
            } else {
                eVar = eVar6;
                z0Var = z0Var3;
                eVar2 = eVar7;
                qVar3.X(1881066665);
                qVar3.p(false);
            }
            boolean invoke$lambda$0$1 = invoke$lambda$0$1(z0Var);
            Object L3 = qVar3.L();
            if (L3 == eVar2) {
                z0Var2 = z0Var;
                L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1$1$2$1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m1632invoke() {
                        BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1.invoke$lambda$0$2(z0.this, false);
                    }

                    @Override // ho.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1632invoke();
                        return sn.z.f31622a;
                    }
                };
                qVar3.h0(L3);
            } else {
                z0Var2 = z0Var;
            }
            MenuKt.m1842MenuILWXrKs(invoke$lambda$0$1, (ho.a) L3, null, 0L, null, ig.f.H(c3.k.d(-1423987159, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1$1$3
                public final void invoke(u2.m mVar2, int i13) {
                    boolean z10;
                    if ((i13 & 3) != 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u2.q qVar4 = (u2.q) mVar2;
                    if (qVar4.O(i13 & 1, z10)) {
                        String R2 = kj.c.R(qVar4, io.elevenlabs.readerapp.R.string.book_purchase_history_request_refund);
                        boolean f10 = qVar4.f(readId) | qVar4.f(lVar);
                        final String str = readId;
                        final ho.l lVar2 = lVar;
                        final z0 z0Var4 = z0Var2;
                        Object L4 = qVar4.L();
                        if (f10 || L4 == u2.l.f33918a) {
                            L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1$1$3$1$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1633invoke() {
                                    BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1.invoke$lambda$0$2(z0Var4, false);
                                    String str2 = str;
                                    if (str2 != null) {
                                        lVar2.invoke(str2);
                                    }
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1633invoke();
                                    return sn.z.f31622a;
                                }
                            };
                            qVar4.h0(L4);
                        }
                        MenuKt.MenuItem((ho.a) L4, false, R2, null, false, false, qVar4, 0, 58);
                        return;
                    }
                    qVar4.R();
                }

                @Override // ho.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((u2.m) obj, ((Number) obj2).intValue());
                    return sn.z.f31622a;
                }
            }, qVar3)), qVar3, 196656, 28);
            qVar3.p(true);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar3, i11).m2356getX4D9Ej5fM()), qVar3);
            r1.h g10 = r1.j.g(elevenLabsTheme.getSpacings(qVar3, i11).m2350getX1D9Ej5fM());
            i3.t e10 = p2.e(qVar2, 1.0f);
            BookPurchaseHistoryItem bookPurchaseHistoryItem2 = this.$it;
            r1.x a11 = r1.w.a(g10, i3.d.B0, qVar3, 0);
            int hashCode2 = Long.hashCode(qVar3.T);
            c3.o l7 = qVar3.l();
            i3.t c10 = i3.a.c(e10, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar3, a11, qVar3);
            u2.r.J(eVar4, l7, qVar3);
            defpackage.f.u(hashCode2, qVar3, eVar5, qVar3, dVar);
            u2.r.J(eVar, c10, qVar3);
            u2.q qVar4 = qVar3;
            j7.d(bookPurchaseHistoryItem2.getTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i11).getBodySmall500(), qVar4, 0, 0, 131070);
            u2.q qVar5 = qVar4;
            String author = bookPurchaseHistoryItem2.getAuthor();
            if (author != null && !wq.n.m0(author)) {
                qVar5.X(432832125);
                j7.d(author, null, ib.i.w(elevenLabsTheme, qVar5, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar5, i11).getBodySmall500(), qVar5, 0, 0, 131066);
                qVar5 = qVar5;
                qVar5.p(false);
            } else {
                qVar5.X(433153440);
                qVar5.p(false);
            }
            u2.q qVar6 = qVar5;
            j7.d(DateFormatterKt.formatDate(bookPurchaseHistoryItem2.getDate(), qVar5, 0), null, ib.i.w(elevenLabsTheme, qVar5, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar5, i11).getBodySmall500(), qVar6, 0, 0, 131066);
            qVar6.p(true);
            return;
        }
        qVar.R();
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((l2) obj, (u2.m) obj2, ((Number) obj3).intValue());
        return sn.z.f31622a;
    }
}
