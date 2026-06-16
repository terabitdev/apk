package io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h4.f;
import h4.g;
import h4.h;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.domain.model.ListeningProgressKt;
import io.elevenlabs.domain.model.Rating;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.TtsTimeConversionKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreHighlightCarouselKt;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jm.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import oa.n;
import om.b;
import q2.j7;
import r1.j;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import tn.p;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001ag\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ag\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"", "title", "", "Lio/elevenlabs/domain/model/ReadMeta;", "reads", "Lkotlin/Function1;", "Lsn/z;", "onNavigateToReadDetails", "Li3/t;", "modifier", "Lio/elevenlabs/domain/model/ExploreRead;", "onPreviewClick", "playingPreviewReadId", "ReadsListSection", "(Ljava/lang/String;Ljava/util/List;Lho/l;Li3/t;Lho/l;Ljava/lang/String;Lu2/m;II)V", "ReadsV2ListSection", "toExploreRead", "(Lio/elevenlabs/domain/model/ReadMeta;)Lio/elevenlabs/domain/model/ExploreRead;", "Preview_ReadsListSection", "(Lu2/m;I)V", "Preview_ReadsV2ListSection", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadsListSectionKt {
    public static final void Preview_ReadsListSection(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1564620267);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(5, null, 2, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new n(4);
                qVar.h0(L);
            }
            ReadsListSection("More by this author", stubReadMetaList$default, (ho.l) L, null, null, null, qVar, 390, 56);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(i10, 25);
        }
    }

    public static final z Preview_ReadsListSection$lambda$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_ReadsListSection$lambda$1(int i10, m mVar, int i11) {
        Preview_ReadsListSection(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ReadsV2ListSection(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2051734735);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<ExploreRead> stubExploreReadList = ExploreFactoryKt.stubExploreReadList(5);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new n(5);
                qVar.h0(L);
            }
            ReadsV2ListSection("You might also like", stubExploreReadList, (ho.l) L, null, null, null, qVar, 390, 56);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(i10, 26);
        }
    }

    public static final z Preview_ReadsV2ListSection$lambda$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_ReadsV2ListSection$lambda$1(int i10, m mVar, int i11) {
        Preview_ReadsV2ListSection(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadsListSection(String str, List<ReadMeta> list, ho.l lVar, t tVar, ho.l lVar2, String str2, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        ho.l lVar3;
        int i15;
        int i16;
        int i17;
        boolean z6;
        q qVar;
        t tVar3;
        ho.l lVar4;
        String str3;
        r1 r10;
        ho.l lVar5;
        int i18;
        int i19;
        int i20;
        str.getClass();
        list.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-452779359);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(list)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                lVar3 = lVar2;
                if (qVar2.h(lVar3)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    if (qVar2.f(str2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    if ((74899 & i12) == 74898) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i12 & 1, z6)) {
                        i3.q qVar3 = i3.q.f13017a;
                        if (i21 != 0) {
                            tVar2 = qVar3;
                        }
                        String str4 = null;
                        if (i14 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i16 == 0) {
                            str4 = str2;
                        }
                        t e10 = p2.e(tVar2, 1.0f);
                        x a10 = w.a(j.f29230c, d.B0, qVar2, 0);
                        int hashCode = Long.hashCode(qVar2.T);
                        o l4 = qVar2.l();
                        t c5 = i3.a.c(e10, qVar2);
                        h.f11920i.getClass();
                        f fVar = g.f11903b;
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(fVar);
                        } else {
                            qVar2.k0();
                        }
                        r.J(g.f11907f, a10, qVar2);
                        r.J(g.f11906e, l4, qVar2);
                        r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
                        r.F(g.f11909h, qVar2);
                        r.J(g.f11905d, c5, qVar2);
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        int i22 = EchoTheme.$stable;
                        int i23 = i12;
                        j7.d(str, r1.d.G(qVar3, echoTheme.getSpacings(qVar2, i22).getX5(), u.P, 2), echoTheme.getColors(qVar2, i22).getText().getPrimary(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i22).getBaseRegular500(qVar2, EchoThemeTypography.$stable), qVar2, i12 & 14, 0, 131064);
                        r1.d.g(p2.f(qVar3, echoTheme.getSpacings(qVar2, i22).getX4()), qVar2);
                        ArrayList arrayList = new ArrayList(p.a0(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(toExploreRead((ReadMeta) it.next()));
                        }
                        int i24 = i23 << 6;
                        String str5 = str4;
                        ho.l lVar6 = lVar5;
                        ExploreHighlightCarouselKt.ExploreHighlightCarousel(null, null, arrayList, lVar, null, null, lVar6, str5, qVar2, ((i23 << 3) & 7168) | 24630 | (3670016 & i24) | (i24 & 29360128), 32);
                        qVar = qVar2;
                        qVar.p(true);
                        tVar3 = tVar2;
                        lVar4 = lVar6;
                        str3 = str5;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        tVar3 = tVar2;
                        lVar4 = lVar3;
                        str3 = str2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new b(str, list, lVar, tVar3, lVar4, str3, i10, i11, 1);
                        return;
                    }
                    return;
                }
                if ((74899 & i12) == 74898) {
                }
                if (!qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar3 = lVar2;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            if ((74899 & i12) == 74898) {
            }
            if (!qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        lVar3 = lVar2;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        if ((74899 & i12) == 74898) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ReadsListSection$lambda$1(String str, List list, ho.l lVar, t tVar, ho.l lVar2, String str2, int i10, int i11, m mVar, int i12) {
        ReadsListSection(str, list, lVar, tVar, lVar2, str2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadsV2ListSection(String str, List<ExploreRead> list, ho.l lVar, t tVar, ho.l lVar2, String str2, m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        t tVar2;
        int i13;
        int i14;
        ho.l lVar4;
        int i15;
        int i16;
        int i17;
        boolean z6;
        q qVar;
        t tVar3;
        ho.l lVar5;
        String str3;
        r1 r10;
        ho.l lVar6;
        int i18;
        int i19;
        int i20;
        str.getClass();
        list.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(984206717);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(list)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            lVar3 = lVar;
            if (qVar2.h(lVar3)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        } else {
            lVar3 = lVar;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                lVar4 = lVar2;
                if (qVar2.h(lVar4)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    if (qVar2.f(str2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    if ((74899 & i12) == 74898) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i12 & 1, z6)) {
                        i3.q qVar3 = i3.q.f13017a;
                        if (i21 != 0) {
                            tVar2 = qVar3;
                        }
                        String str4 = null;
                        if (i14 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar4;
                        }
                        if (i16 == 0) {
                            str4 = str2;
                        }
                        t e10 = p2.e(tVar2, 1.0f);
                        x a10 = w.a(j.f29230c, d.B0, qVar2, 0);
                        int hashCode = Long.hashCode(qVar2.T);
                        o l4 = qVar2.l();
                        t c5 = i3.a.c(e10, qVar2);
                        h.f11920i.getClass();
                        f fVar = g.f11903b;
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(fVar);
                        } else {
                            qVar2.k0();
                        }
                        r.J(g.f11907f, a10, qVar2);
                        r.J(g.f11906e, l4, qVar2);
                        r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
                        r.F(g.f11909h, qVar2);
                        r.J(g.f11905d, c5, qVar2);
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        int i22 = EchoTheme.$stable;
                        int i23 = i12;
                        j7.d(str, r1.d.G(qVar3, echoTheme.getSpacings(qVar2, i22).getX5(), u.P, 2), echoTheme.getColors(qVar2, i22).getText().getPrimary(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i22).getBaseRegular500(qVar2, EchoThemeTypography.$stable), qVar2, i12 & 14, 0, 131064);
                        i.o(echoTheme, qVar2, i22, qVar3, qVar2);
                        int i24 = i23 << 3;
                        int i25 = i23 << 6;
                        String str5 = str4;
                        ho.l lVar7 = lVar6;
                        ExploreHighlightCarouselKt.ExploreHighlightCarousel(null, null, list, lVar3, null, null, lVar7, str5, qVar2, (i24 & 7168) | (i24 & 896) | 24630 | (3670016 & i25) | (i25 & 29360128), 32);
                        qVar = qVar2;
                        qVar.p(true);
                        tVar3 = tVar2;
                        lVar5 = lVar7;
                        str3 = str5;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        tVar3 = tVar2;
                        lVar5 = lVar4;
                        str3 = str2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new b(str, list, lVar, tVar3, lVar5, str3, i10, i11, 0);
                        return;
                    }
                    return;
                }
                if ((74899 & i12) == 74898) {
                }
                if (!qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar4 = lVar2;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            if ((74899 & i12) == 74898) {
            }
            if (!qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        lVar4 = lVar2;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        if ((74899 & i12) == 74898) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ReadsV2ListSection$lambda$1(String str, List list, ho.l lVar, t tVar, ho.l lVar2, String str2, int i10, int i11, m mVar, int i12) {
        ReadsV2ListSection(str, list, lVar, tVar, lVar2, str2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final ExploreRead toExploreRead(ReadMeta readMeta) {
        double charsToSeconds;
        Float f10;
        ExplorePricingType explorePricingType;
        String readId = readMeta.getReadId();
        String title = readMeta.getTitle();
        String author = readMeta.getAuthor();
        String articleImageUrl = readMeta.getArticleImageUrl();
        ListeningProgress listeningProgress = ListeningProgressKt.getListeningProgress(readMeta);
        if (listeningProgress.isAudioOnly() && listeningProgress.getTotalUnits() > 0.0d) {
            charsToSeconds = listeningProgress.getTotalUnits();
        } else {
            charsToSeconds = TtsTimeConversionKt.charsToSeconds(readMeta.getCharCount());
        }
        Float valueOf = Float.valueOf((float) charsToSeconds);
        Rating rating = readMeta.getRating();
        Integer num = null;
        if (rating != null) {
            f10 = Float.valueOf(rating.getAverage());
        } else {
            f10 = null;
        }
        Rating rating2 = readMeta.getRating();
        if (rating2 != null) {
            num = Integer.valueOf((int) rating2.getCount());
        }
        Integer num2 = num;
        if (!readMeta.isPaid()) {
            explorePricingType = ExplorePricingType.Free;
        } else if (readMeta.getAndroidProductId() != null) {
            explorePricingType = ExplorePricingType.Paid;
        } else {
            explorePricingType = ExplorePricingType.Ultra;
        }
        return new ExploreRead(readId, title, author, articleImageUrl, valueOf, f10, num2, explorePricingType, null, null, null, readMeta.getAndroidProductId(), readMeta.getPreviewAudio(), null, null, null, 57344, null);
    }
}
