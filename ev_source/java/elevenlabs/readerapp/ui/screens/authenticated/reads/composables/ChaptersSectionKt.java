package io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables;

import a2.d0;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e5.k;
import h4.f;
import h4.g;
import h4.h;
import i3.a;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.ChapterItem;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.f1;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.q1;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.d;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.e;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"", "title", "", "Lio/elevenlabs/domain/model/ChapterItem;", "chapters", "Li3/t;", "modifier", "", "collapseChaptersNum", "Lsn/z;", "ChaptersSection", "(Ljava/lang/String;Ljava/util/List;Li3/t;ILu2/m;II)V", "number", DiagnosticsEntry.NAME_KEY, "ChapterItem", "(ILjava/lang/String;Li3/t;Lu2/m;II)V", "Preview_ChaptersSection_Few", "(Lu2/m;I)V", "Preview_ChaptersSection_Many", "", "isExpanded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ChaptersSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ChapterItem(int i10, String str, t tVar, m mVar, int i11, int i12) {
        int i13;
        int i14;
        t tVar2;
        int i15;
        boolean z6;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        int i16;
        int i17;
        q qVar2 = (q) mVar;
        qVar2.Z(-1331544928);
        if ((i11 & 6) == 0) {
            i13 = i10;
            if (qVar2.d(i13)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i14 = i17 | i11;
        } else {
            i13 = i10;
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar2.f(str)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i14 |= i15;
            if ((i14 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i14 & 1, z6)) {
                i3.q qVar3 = i3.q.f13017a;
                if (i18 != 0) {
                    tVar4 = qVar3;
                } else {
                    tVar4 = tVar2;
                }
                t e10 = p2.e(tVar4, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i19 = EchoTheme.$stable;
                t I = d.I(e10, echoTheme.getSpacings(qVar2, i19).getX4(), u.P, u.P, u.P, 14);
                u0 u0Var = j.f29228a;
                k2 a10 = i2.a(i.y(echoTheme, qVar2, i19), i3.d.f13004y0, qVar2, 48);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = a.c(I, qVar2);
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
                String valueOf = String.valueOf(i13);
                EchoThemeTypography typography = echoTheme.getTypography(qVar2, i19);
                int i20 = EchoThemeTypography.$stable;
                y0 baseRegular500 = typography.getBaseRegular500(qVar2, i20);
                EchoThemeColors.Text text = echoTheme.getColors(qVar2, i19).getText();
                int i21 = EchoThemeColors.Text.$stable;
                t tVar5 = tVar4;
                int i22 = i14;
                j7.d(valueOf, p2.u(qVar3, 24, u.P, 2), text.getTertiary(qVar2, i21), 0L, null, 0L, new k(6), 0L, 0, false, 0, 0, null, baseRegular500, qVar2, 48, 0, 130040);
                y0 baseRegular5002 = echoTheme.getTypography(qVar2, i19).getBaseRegular500(qVar2, i20);
                long v9 = i.v(i19, i21, echoTheme, qVar2, qVar2);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                j7.d(str, new m1(1.0f, true), v9, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular5002, qVar2, (i22 >> 3) & 14, 0, 131064);
                qVar = qVar2;
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new q1(i10, str, tVar3, i11, i12, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i14 & 147) == 146) {
        }
        if (!qVar2.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ChapterItem$lambda$1(int i10, String str, t tVar, int i11, int i12, m mVar, int i13) {
        ChapterItem(i10, str, tVar, mVar, r.M(i11 | 1), i12);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChaptersSection(String str, List<ChapterItem> list, t tVar, int i10, m mVar, int i11, int i12) {
        int i13;
        t tVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z6;
        t tVar3;
        int i18;
        r1 r10;
        boolean z10;
        List<ChapterItem> list2;
        int i19;
        int i20;
        int i21;
        str.getClass();
        list.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1831838459);
        if ((i11 & 6) == 0) {
            if (qVar.f(str)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i13 = i21 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.h(list)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i13 |= i20;
        }
        int i22 = i12 & 4;
        if (i22 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i13 |= i14;
            i15 = i12 & 8;
            if (i15 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i16 = i10;
                if (qVar.d(i16)) {
                    i17 = 2048;
                } else {
                    i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i13 |= i17;
                if ((i13 & 1171) != 1170) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i13 & 1, z6)) {
                    if (i22 != 0) {
                        tVar3 = i3.q.f13017a;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i15 != 0) {
                        i18 = 5;
                    } else {
                        i18 = i16;
                    }
                    Object L = qVar.L();
                    e eVar = l.f33918a;
                    if (L == eVar) {
                        L = r.A(Boolean.FALSE);
                        qVar.h0(L);
                    }
                    z0 z0Var = (z0) L;
                    if (list.size() > i18) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !ChaptersSection$lambda$1(z0Var)) {
                        list2 = tn.o.b1(list, i18);
                    } else {
                        list2 = list;
                    }
                    t e10 = p2.e(tVar3, 1.0f);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i23 = EchoTheme.$stable;
                    t G = d.G(e10, echoTheme.getSpacings(qVar, i23).getX5(), u.P, 2);
                    u0 u0Var = j.f29228a;
                    x a10 = w.a(i.y(echoTheme, qVar, i23), i3.d.B0, qVar, 0);
                    int hashCode = Long.hashCode(qVar.T);
                    o l4 = qVar.l();
                    t c5 = a.c(G, qVar);
                    h.f11920i.getClass();
                    f fVar = g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    r.J(g.f11907f, a10, qVar);
                    r.J(g.f11906e, l4, qVar);
                    r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                    r.F(g.f11909h, qVar);
                    r.J(g.f11905d, c5, qVar);
                    j7.d(str, null, echoTheme.getColors(qVar, i23).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i23).getBaseRegular500(qVar, EchoThemeTypography.$stable), qVar, i13 & 14, 0, 131066);
                    qVar = qVar;
                    qVar.X(-662141174);
                    int i24 = 0;
                    for (Object obj : list2) {
                        int i25 = i24 + 1;
                        if (i24 >= 0) {
                            ChapterItem(i25, ((ChapterItem) obj).getName(), null, qVar, 0, 4);
                            i24 = i25;
                        } else {
                            ig.f.U();
                            throw null;
                        }
                    }
                    qVar.p(false);
                    if (z10) {
                        qVar.X(948655605);
                        if (ChaptersSection$lambda$1(z0Var)) {
                            i19 = R.string.read_details_chapters_show_less;
                        } else {
                            i19 = R.string.read_details_chapters_show_all;
                        }
                        String R = c.R(qVar, i19);
                        Object L2 = qVar.L();
                        if (L2 == eVar) {
                            L2 = new d0(z0Var, 26);
                            qVar.h0(L2);
                        }
                        EchoButtonKt.m1835EchoButton562pCRU(R, (ho.a) L2, null, EchoButtonVariant.Ghost, EchoButtonSize.Small, null, false, false, null, false, false, qVar, 27696, 0, 2020);
                        qVar = qVar;
                        qVar.p(false);
                    } else {
                        qVar.X(949114963);
                        qVar.p(false);
                    }
                    qVar.p(true);
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    i18 = i16;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new f1(str, list, tVar3, i18, i11, i12);
                    return;
                }
                return;
            }
            i16 = i10;
            if ((i13 & 1171) != 1170) {
            }
            if (qVar.O(i13 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 8;
        if (i15 == 0) {
        }
        i16 = i10;
        if ((i13 & 1171) != 1170) {
        }
        if (qVar.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final boolean ChaptersSection$lambda$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void ChaptersSection$lambda$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z ChaptersSection$lambda$3$1$0(z0 z0Var) {
        ChaptersSection$lambda$2(z0Var, !ChaptersSection$lambda$1(z0Var));
        return z.f31622a;
    }

    public static final z ChaptersSection$lambda$4(String str, List list, t tVar, int i10, int i11, int i12, m mVar, int i13) {
        ChaptersSection(str, list, tVar, i10, mVar, r.M(i11 | 1), i12);
        return z.f31622a;
    }

    public static final void Preview_ChaptersSection_Few(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1890632598);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ChaptersSection("Chapters", ig.f.I(new ChapterItem("Introduction: The Library Between Life and Death"), new ChapterItem("A Conversation About Rain"), new ChapterItem("The Midnight Library")), null, 0, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 22);
        }
    }

    public static final z Preview_ChaptersSection_Few$lambda$0(int i10, m mVar, int i11) {
        Preview_ChaptersSection_Few(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ChaptersSection_Many(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1769957061);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ChaptersSection("Chapters", ig.f.I(new ChapterItem("Chapter 1: The Beginning"), new ChapterItem("Chapter 2: The Journey Starts"), new ChapterItem("Chapter 3: The Discovery"), new ChapterItem("Chapter 4: The Revelation"), new ChapterItem("Chapter 5: The Turning Point"), new ChapterItem("Chapter 6: The Confrontation"), new ChapterItem("Chapter 7: The Resolution"), new ChapterItem("Chapter 8: The Aftermath"), new ChapterItem("Chapter 9: The New Dawn"), new ChapterItem("Chapter 10: The Conclusion")), null, 0, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 23);
        }
    }

    public static final z Preview_ChaptersSection_Many$lambda$0(int i10, m mVar, int i11) {
        Preview_ChaptersSection_Many(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
