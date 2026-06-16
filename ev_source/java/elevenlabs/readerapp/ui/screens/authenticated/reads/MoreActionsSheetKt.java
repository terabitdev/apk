package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.readerapp.ui.components.ReadSmallRowKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.b1;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import s4.y0;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u0083\u0001\u0010\r\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a/\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "", "isInQueue", "Lkotlin/Function0;", "Lsn/z;", "onClickListen", "onClickAddToQueue", "onClickRemoveFromQueue", "onClickShare", "onClickAddToCollection", "onClickHelp", "onDismiss", "MoreActionsSheet", "(Lio/elevenlabs/domain/model/ReadMeta;ZLho/a;Lho/a;Lho/a;Lho/a;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "MoreActionsSheetUI", "", ParameterNames.TEXT, "", "iconResId", "onClick", "SheetItem", "(Ljava/lang/String;ILho/a;Lu2/m;I)V", "HeaderShimmering", "(Lho/a;Lu2/m;I)V", "Preview_MoreActionsSheet_NotInQueue", "(Lu2/m;I)V", "Preview_MoreActionsSheet_InQueue", "Preview_MoreActionsSheet_Loading", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MoreActionsSheetKt {
    private static final void HeaderShimmering(ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1376631075);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(r1.d.E(qVar2, 16), 1.0f);
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            ReadSmallRowKt.ReadSmallShimmeringRow(new m1(1.0f, true), qVar, 0);
            i3.l lVar = i3.d.f13001e;
            i3.t o6 = p2.o(qVar2, 44);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            i3.t p10 = l1.n.p(m3.h.c(o6, echoTheme.getShapes(qVar, i13).getMd(qVar, EchoThemeShapes.$stable)), false, null, null, null, aVar, 15);
            f1 d10 = r1.p.d(lVar, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(p10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            y2.a(kd.a.M(R.drawable.close, qVar, 0), null, p2.o(qVar2, 20), echoTheme.getColors(qVar, i13).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar, i10, 12);
        }
    }

    public static final sn.z HeaderShimmering$lambda$1(ho.a aVar, int i10, u2.m mVar, int i11) {
        HeaderShimmering(aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void MoreActionsSheet(final ReadMeta readMeta, final boolean z6, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, final ho.a aVar4, final ho.a aVar5, final ho.a aVar6, final ho.a aVar7, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        aVar7.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(58034561);
        if ((i10 & 6) == 0) {
            if (qVar2.h(readMeta)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i11 = i20 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.g(z6)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i11 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i11 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar2)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar3)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i16;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.h(aVar4)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i11 |= i15;
        }
        if ((1572864 & i10) == 0) {
            if (qVar2.h(aVar5)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i11 |= i14;
        }
        if ((12582912 & i10) == 0) {
            if (qVar2.h(aVar6)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i11 |= i13;
        }
        if ((100663296 & i10) == 0) {
            if (qVar2.h(aVar7)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i11 |= i12;
        }
        if ((38347923 & i11) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar2.O(i11 & 1, z10)) {
            qVar = qVar2;
            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(true, false, 0L, t2.u.P, aVar7, false, (ho.r) c3.k.d(748727055, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.j0
                @Override // ho.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    sn.z MoreActionsSheet$lambda$0;
                    int intValue = ((Integer) obj4).intValue();
                    MoreActionsSheet$lambda$0 = MoreActionsSheetKt.MoreActionsSheet$lambda$0(ReadMeta.this, z6, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue);
                    return MoreActionsSheet$lambda$0;
                }
            }, qVar2), (u2.m) qVar, ((i11 >> 12) & 57344) | 1572870, 46);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(readMeta, z6, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, i10, 1);
        }
    }

    public static final sn.z MoreActionsSheet$lambda$0(ReadMeta readMeta, boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, ho.a aVar7, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        MoreActionsSheetUI(readMeta, z6, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, mVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z MoreActionsSheet$lambda$1(ReadMeta readMeta, boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, ho.a aVar7, int i10, u2.m mVar, int i11) {
        MoreActionsSheet(readMeta, z6, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void MoreActionsSheetUI(ReadMeta readMeta, boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, ho.a aVar7, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        ho.a aVar8;
        ho.a aVar9;
        boolean z11;
        int i12;
        ho.a aVar10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(22654677);
        if ((i10 & 6) == 0) {
            if (qVar.h(readMeta)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i11 = i21 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i11 |= i20;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i19 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i19 = 128;
            }
            i11 |= i19;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar2)) {
                i18 = 2048;
            } else {
                i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i18;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar3)) {
                i17 = 16384;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i17;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(aVar4)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i11 |= i16;
        }
        if ((1572864 & i10) == 0) {
            if (qVar.h(aVar5)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i11 |= i15;
        }
        if ((12582912 & i10) == 0) {
            if (qVar.h(aVar6)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i11 |= i14;
        }
        if ((100663296 & i10) == 0) {
            if (qVar.h(aVar7)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i11 |= i13;
        }
        if ((38347923 & i11) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i22 = EchoTheme.$stable;
            float x2_5 = echoTheme.getSpacings(qVar, i22).getX2_5();
            float x2_52 = echoTheme.getSpacings(qVar, i22).getX2_5();
            float x62 = echoTheme.getSpacings(qVar, i22).getX6();
            float x63 = echoTheme.getSpacings(qVar, i22).getX6();
            i3.q qVar2 = i3.q.f13017a;
            i3.t H = r1.d.H(qVar2, x2_5, x62, x2_52, x63);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(H, qVar);
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
            if (readMeta != null) {
                qVar.X(-1730186761);
                float x1_5 = echoTheme.getSpacings(qVar, i22).getX1_5();
                String title = readMeta.getTitle();
                String author = readMeta.getAuthor();
                if (author == null) {
                    author = "ElevenLabs";
                }
                z11 = true;
                ReadSmallRowKt.m1091ReadSmallRowgMrHQkA(title, author, ReadMetaKt.coverImageUrl(readMeta, CoverImageSize.Medium), readMeta.getSource(), readMeta.getOriginalFileType(), null, c3.k.d(496059400, true, new d(aVar7, 2), qVar), x1_5, null, qVar, 1769472, RpcError.MAX_MESSAGE_BYTES);
                qVar = qVar;
                qVar.p(false);
            } else {
                z11 = true;
                qVar.X(-1729111836);
                HeaderShimmering(aVar7, qVar, (i11 >> 24) & 14);
                qVar.p(false);
            }
            DividerKt.m1827DivideriJQMabo(r1.d.I(p2.e(qVar2, 1.0f), t2.u.P, 16, t2.u.P, 8, 5), 0L, qVar, 6, 2);
            SheetItem(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_details_more_actions_item_title_listen), R.drawable.ic_play, aVar, qVar, i11 & 896);
            if (z6) {
                i12 = io.elevenlabs.readerapp.R.string.read_details_more_actions_item_title_remove_from_queue;
            } else {
                i12 = io.elevenlabs.readerapp.R.string.read_details_more_actions_item_title_add_to_queue;
            }
            String R = kj.c.R(qVar, i12);
            int i23 = R.drawable.playlist_add;
            if (z6) {
                aVar10 = aVar3;
            } else {
                aVar10 = aVar2;
            }
            SheetItem(R, i23, aVar10, qVar, 0);
            SheetItem(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_details_more_actions_item_title_share), R.drawable.share_2, aVar4, qVar, (i11 >> 9) & 896);
            aVar9 = aVar5;
            SheetItem(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_details_more_actions_item_title_add_to_collection), R.drawable.slide_add, aVar9, qVar, (i11 >> 12) & 896);
            aVar8 = aVar6;
            SheetItem(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_details_more_actions_item_title_help), R.drawable.rescue_ring, aVar8, qVar, (i11 >> 15) & 896);
            qVar.p(z11);
        } else {
            aVar8 = aVar6;
            aVar9 = aVar5;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(readMeta, z6, aVar, aVar2, aVar3, aVar4, aVar9, aVar8, aVar7, i10, 0);
        }
    }

    public static final sn.z MoreActionsSheetUI$lambda$0$0(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.l lVar = i3.d.f13001e;
            i3.q qVar2 = i3.q.f13017a;
            i3.t o6 = p2.o(qVar2, 44);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t p10 = l1.n.p(m3.h.c(o6, echoTheme.getShapes(qVar, i11).getLg(qVar, EchoThemeShapes.$stable)), false, null, null, null, aVar, 15);
            f1 d10 = r1.p.d(lVar, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(p10, qVar);
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
            y2.a(kd.a.M(R.drawable.close, qVar, 0), null, p2.o(qVar2, 20), echoTheme.getColors(qVar, i11).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MoreActionsSheetUI$lambda$1(ReadMeta readMeta, boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, ho.a aVar7, int i10, u2.m mVar, int i11) {
        MoreActionsSheetUI(readMeta, z6, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_MoreActionsSheet_InQueue(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1451872016);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new c(14);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(20);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new c(26);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new c(29);
                qVar.h0(L4);
            }
            ho.a aVar4 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new k0(0);
                qVar.h0(L5);
            }
            ho.a aVar5 = (ho.a) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new k0(1);
                qVar.h0(L6);
            }
            ho.a aVar6 = (ho.a) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new k0(2);
                qVar.h0(L7);
            }
            MoreActionsSheetUI(stubReadMeta$default, true, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, (ho.a) L7, qVar, 115043760);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 28);
        }
    }

    public static final sn.z Preview_MoreActionsSheet_InQueue$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MoreActionsSheet_InQueue(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_MoreActionsSheet_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-88947904);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new k0(3);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(4);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new c(15);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new c(16);
                qVar.h0(L4);
            }
            ho.a aVar4 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new c(17);
                qVar.h0(L5);
            }
            ho.a aVar5 = (ho.a) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new c(18);
                qVar.h0(L6);
            }
            ho.a aVar6 = (ho.a) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new c(19);
                qVar.h0(L7);
            }
            MoreActionsSheetUI(null, false, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, (ho.a) L7, qVar, 115043766);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 26);
        }
    }

    public static final sn.z Preview_MoreActionsSheet_Loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MoreActionsSheet_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_MoreActionsSheet_NotInQueue(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(738163971);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new c(21);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(22);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new c(23);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new c(24);
                qVar.h0(L4);
            }
            ho.a aVar4 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new c(25);
                qVar.h0(L5);
            }
            ho.a aVar5 = (ho.a) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new c(27);
                qVar.h0(L6);
            }
            ho.a aVar6 = (ho.a) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new c(28);
                qVar.h0(L7);
            }
            MoreActionsSheetUI(stubReadMeta$default, false, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, (ho.a) L7, qVar, 115043760);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 27);
        }
    }

    public static final sn.z Preview_MoreActionsSheet_NotInQueue$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MoreActionsSheet_NotInQueue(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void SheetItem(String str, int i10, ho.a aVar, u2.m mVar, int i11) {
        int i12;
        boolean z6;
        boolean z10;
        int i13;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2028720555);
        if ((i11 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.d(i10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 384) == 0) {
            if (qVar.h(aVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        int i16 = i12;
        boolean z11 = false;
        if ((i16 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i16 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i17 = EchoTheme.$stable;
            b1 md = echoTheme.getShapes(qVar, i17).getMd(qVar, EchoThemeShapes.$stable);
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = ib.i.e(echoTheme, qVar, i17, p2.e(l1.n.p(m3.h.c(qVar2, md), false, null, null, null, aVar, 15), 1.0f));
            int i18 = i16 & 14;
            if (i18 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i16 & 896) == 256) {
                z11 = true;
            }
            boolean z12 = z10 | z11;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (z12 || L == eVar) {
                L = new h(str, aVar, 7);
                qVar.h0(L);
            }
            i3.t c5 = p4.q.c(e10, true, (ho.l) L);
            i3.k kVar = i3.d.f13005z0;
            r1.u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(ib.i.y(echoTheme, qVar, i17), kVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(c5, qVar);
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
            u2.r.J(h4.g.f11905d, c10, qVar);
            y2.a(kd.a.M(i10, qVar, (i16 >> 3) & 14), null, p2.o(qVar2, 20), echoTheme.getColors(qVar, i17).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
            y0 baseRegular500 = echoTheme.getTypography(qVar, i17).getBaseRegular500(qVar, EchoThemeTypography.$stable);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e0(6);
                qVar.h0(L2);
            }
            j7.d(str, p4.q.b(qVar2, (ho.l) L2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar, i18, 0, 131068);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new h0(str, i10, aVar, i11, 0);
        }
    }

    public static final sn.z SheetItem$lambda$0$0(String str, ho.a aVar, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        p4.y.e(b0Var, ig.f.H(new p4.f(str, new f(4, aVar))));
        return sn.z.f31622a;
    }

    public static final boolean SheetItem$lambda$0$0$0(ho.a aVar) {
        aVar.invoke();
        return true;
    }

    public static final sn.z SheetItem$lambda$1$0$0(p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.b(b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z SheetItem$lambda$2(String str, int i10, ho.a aVar, int i11, u2.m mVar, int i12) {
        SheetItem(str, i10, aVar, mVar, u2.r.M(i11 | 1));
        return sn.z.f31622a;
    }
}
