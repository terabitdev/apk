package io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements;

import a2.h3;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ho.l;
import i3.t;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ExploreKt;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.readerapp.ui.components.AuthorPictureKt;
import io.elevenlabs.readerapp.ui.components.AuthorPictureSize;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.components.explore.ExploreBookCoverKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreCarouselDefaultsKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreSectionHeaderKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.w0;
import q2.j7;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.s;
import r1.w;
import r1.x;
import rd.c1;
import s4.y0;
import t1.z;
import t2.u;
import tn.o;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\u001a]\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "title", "subtitle", "", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreVoiceCollection$VoiceItem;", "voices", "Lkotlin/Function1;", "Lsn/z;", "onVoiceClick", "Lkotlin/Function0;", "onSeeAllClick", "Li3/t;", "modifier", "ExploreVoiceCollection", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lho/l;Lho/a;Li3/t;Lu2/m;II)V", "voice", "VoiceCard", "(Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreVoiceCollection$VoiceItem;Lho/l;Li3/t;Lu2/m;II)V", "Preview_ExploreVoiceCollection", "(Lu2/m;I)V", "Preview_ExploreVoiceCollection_NoSubtitle", "", "VOICE_PREVIEW_BOOK_COUNT", TokenNames.I, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreVoiceCollectionKt {
    private static final int VOICE_PREVIEW_BOOK_COUNT = 4;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreVoiceCollection(String str, String str2, List<ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem> list, l lVar, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        q qVar;
        r1 r10;
        t tVar4;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        str.getClass();
        list.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-695404569);
        int i19 = 4;
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(list)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(lVar)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i14;
        }
        int i20 = i11 & 32;
        if (i20 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            if ((74899 & i12) == 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                i3.q qVar3 = i3.q.f13017a;
                if (i20 != 0) {
                    tVar4 = qVar3;
                } else {
                    tVar4 = tVar2;
                }
                boolean f10 = qVar2.f(list);
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                Object obj = L;
                if (f10 || L == eVar) {
                    ArrayList arrayList = new ArrayList();
                    for (ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem voiceItem : list) {
                        un.b o6 = ig.f.o();
                        o6.add(voiceItem.getAvatarUrl());
                        Iterator it = o.b1(voiceItem.getReads(), i19).iterator();
                        while (it.hasNext()) {
                            o6.add(ExploreKt.coverImageUrl((ExploreRead) it.next(), CoverImageSize.Medium));
                        }
                        o.g0(ig.f.i(o6), arrayList);
                        i19 = 4;
                    }
                    qVar2.h0(arrayList);
                    obj = arrayList;
                }
                ExploreCarouselDefaultsKt.PreloadCarouselImages((List) obj, false, qVar2, 0, 2);
                t e10 = p2.e(tVar4, 1.0f);
                x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                t c5 = i3.a.c(e10, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(h4.g.f11907f, a10, qVar2);
                r.J(h4.g.f11906e, l4, qVar2);
                r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar2);
                r.J(h4.g.f11905d, c5, qVar2);
                ExploreSectionHeaderKt.ExploreSectionHeader(str, null, str2, aVar, qVar2, (i12 & 14) | ((i12 << 3) & 896) | ((i12 >> 3) & 7168), 2);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i21 = EchoTheme.$stable;
                ib.i.o(echoTheme, qVar2, i21, qVar3, qVar2);
                z rememberCarouselLazyListState = ExploreCarouselDefaultsKt.rememberCarouselLazyListState(qVar2, 0);
                d2 d10 = r1.d.d(echoTheme.getSpacings(qVar2, i21).getX5(), u.P, 2);
                r1.h y10 = ib.i.y(echoTheme, qVar2, i21);
                t e11 = p2.e(qVar3, 1.0f);
                boolean h10 = qVar2.h(list);
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = h10 | z10;
                Object L2 = qVar2.L();
                if (z11 || L2 == eVar) {
                    L2 = new io.elevenlabs.readerapp.ui.components.explore.h(list, 1, lVar);
                    qVar2.h0(L2);
                }
                c1.d(e11, rememberCarouselLazyListState, d10, y10, null, null, false, null, (l) L2, qVar2, 6, 488);
                q qVar4 = qVar2;
                qVar4.p(true);
                tVar3 = tVar4;
                qVar = qVar4;
            } else {
                qVar2.R();
                tVar3 = tVar2;
                qVar = qVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.i(str, str2, list, lVar, aVar, tVar3, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ExploreVoiceCollection$lambda$1$0$0(final List list, final l lVar, t1.t tVar) {
        tVar.getClass();
        final ExploreVoiceCollectionKt$ExploreVoiceCollection$lambda$1$0$0$$inlined$items$default$1 exploreVoiceCollectionKt$ExploreVoiceCollection$lambda$1$0$0$$inlined$items$default$1 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreVoiceCollectionKt$ExploreVoiceCollection$lambda$1$0$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem) obj);
            }

            @Override // ho.l
            public final Void invoke(ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem voiceItem) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), null, new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreVoiceCollectionKt$ExploreVoiceCollection$lambda$1$0$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreVoiceCollectionKt$ExploreVoiceCollection$lambda$1$0$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((q) mVar).d(i10)) {
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
                q qVar = (q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem voiceItem = (ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem) list.get(i10);
                    qVar.X(-522133878);
                    ExploreVoiceCollectionKt.VoiceCard(voiceItem, lVar, p2.s(i3.q.f13017a, 320), qVar, 384, 0);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 802480018));
        return sn.z.f31622a;
    }

    public static final sn.z ExploreVoiceCollection$lambda$2(String str, String str2, List list, l lVar, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        ExploreVoiceCollection(str, str2, list, lVar, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreVoiceCollection(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(521168478);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreVoiceCollectionKt.INSTANCE.getLambda$1664331076$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 19);
        }
    }

    public static final sn.z Preview_ExploreVoiceCollection$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreVoiceCollection(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreVoiceCollection_NoSubtitle(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(475144810);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreVoiceCollectionKt.INSTANCE.getLambda$1898033092$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 20);
        }
    }

    public static final sn.z Preview_ExploreVoiceCollection_NoSubtitle$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreVoiceCollection_NoSubtitle(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoiceCard(ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem voiceItem, l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        int i15;
        q qVar2 = (q) mVar;
        qVar2.Z(1674977341);
        if ((i10 & 6) == 0) {
            if (qVar2.h(voiceItem)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            boolean z10 = false;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                String voiceName = voiceItem.getVoiceName();
                boolean h10 = qVar2.h(voiceItem);
                if ((i12 & 112) == 32) {
                    z10 = true;
                }
                boolean z11 = h10 | z10;
                Object L = qVar2.L();
                if (z11 || L == u2.l.f33918a) {
                    L = new a2.q(voiceItem, lVar, 23);
                    qVar2.h0(L);
                }
                qVar = qVar2;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(voiceName, (ho.a) L, m3.h.c(tVar4, EchoTheme.INSTANCE.getShapes(qVar2, EchoTheme.$stable).getTwoXl(qVar2, EchoThemeShapes.$stable)), 0L, false, 0, null, false, null, c3.k.d(61828569, true, new h3(voiceItem, 6), qVar2), qVar, 805306368, 504);
                tVar3 = tVar4;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(voiceItem, lVar, tVar3, i10, i11, 29);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z102 = false;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z VoiceCard$lambda$0$0(ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem voiceItem, l lVar) {
        String deeplink = voiceItem.getDeeplink();
        if (deeplink != null) {
            lVar.invoke(deeplink);
        }
        return sn.z.f31622a;
    }

    public static final sn.z VoiceCard$lambda$1(ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem voiceItem, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            long denary = echoTheme.getColors(qVar, i11).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable);
            w0 w0Var = h0.f26395b;
            i3.q qVar2 = i3.q.f13017a;
            t h10 = n.h(qVar2, denary, w0Var);
            r1.e eVar = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            x a10 = w.a(eVar, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            r.J(eVar2, a10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            r.J(eVar5, c5, qVar);
            t E = r1.d.E(p2.e(qVar2, 1.0f), echoTheme.getSpacings(qVar, i11).getX5());
            k2 a11 = i2.a(r1.j.g(echoTheme.getSpacings(qVar, i11).getX3()), i3.d.f13005z0, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(E, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar2, a11, qVar);
            r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            r.J(eVar5, c10, qVar);
            AuthorPictureKt.AuthorPicture(voiceItem.getAvatarUrl(), AuthorPictureSize.Medium, null, qVar, 48, 4);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            x a12 = w.a(r1.j.g(echoTheme.getSpacings(qVar, i11).getX1()), jVar, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            t c11 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar2, a12, qVar);
            r.J(eVar3, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
            r.J(eVar5, c11, qVar);
            String voiceName = voiceItem.getVoiceName();
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i11);
            int i12 = EchoThemeTypography.$stable;
            y0 baseCompact400 = typography.getBaseCompact400(qVar, i12);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i11).getText();
            int i13 = EchoThemeColors.Text.$stable;
            j7.d(voiceName, null, text.getPrimary(qVar, i13), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, baseCompact400, qVar, 0, 24960, 110586);
            q qVar3 = qVar;
            String voiceSubtitle = voiceItem.getVoiceSubtitle();
            if (voiceSubtitle == null) {
                qVar3.X(-591689798);
                qVar3.p(false);
            } else {
                qVar3.X(-591689797);
                j7.d(voiceSubtitle, null, ib.i.B(i11, i13, echoTheme, qVar3, qVar3), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar3, i11).getSmCompact400(qVar3, i12), qVar3, 0, 24960, 110586);
                qVar3 = qVar3;
                qVar3.p(false);
            }
            qVar3.p(true);
            qVar3.p(true);
            i3.q qVar4 = qVar2;
            r1.d.g(p2.f(qVar4, 4), qVar3);
            t t10 = n.t(r1.d.I(p2.e(qVar4, 1.0f), echoTheme.getSpacings(qVar3, i11).getX5(), u.P, u.P, u.P, 14), n.x(qVar3), 12);
            k2 a13 = i2.a(r1.j.g(-echoTheme.getSpacings(qVar3, i11).getX3()), i3.d.f13004y0, qVar3, 0);
            int hashCode4 = Long.hashCode(qVar3.T);
            c3.o l11 = qVar3.l();
            t c12 = i3.a.c(t10, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(eVar2, a13, qVar3);
            r.J(eVar3, l11, qVar3);
            defpackage.f.u(hashCode4, qVar3, eVar4, qVar3, dVar);
            r.J(eVar5, c12, qVar3);
            qVar3.X(1717591152);
            for (ExploreRead exploreRead : o.b1(voiceItem.getReads(), 4)) {
                BookCoverSize bookCoverSize = BookCoverSize.Medium;
                long size = bookCoverSize.getSize();
                t l12 = p2.l(qVar4, h5.h.b(size), h5.h.a(size));
                String coverImageUrl = ExploreKt.coverImageUrl(exploreRead, CoverImageSize.Medium);
                String title = exploreRead.getTitle();
                long j4 = p3.x.f26437l;
                q qVar5 = qVar3;
                ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(coverImageUrl, bookCoverSize, l12, u.P, false, false, j4, j4, title, null, null, false, exploreRead.getBlurPlaceholder(), exploreRead.getCoverAspectRatio(), false, null, qVar5, 14156208, 0, 52792);
                qVar4 = qVar4;
                qVar3 = qVar5;
            }
            qVar3.p(false);
            qVar3.p(true);
            r1.d.g(p2.f(qVar4, 20), qVar3);
            qVar3.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z VoiceCard$lambda$2(ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem voiceItem, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        VoiceCard(voiceItem, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
