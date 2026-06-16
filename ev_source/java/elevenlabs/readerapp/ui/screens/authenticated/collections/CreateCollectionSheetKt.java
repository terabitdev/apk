package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import a2.a2;
import a2.y1;
import a2.z1;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import f4.f1;
import i4.j1;
import i4.l1;
import i4.m2;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.CenteredCloseHeaderKt;
import io.elevenlabs.readerapp.ui.components.RememberCollectionIconKt;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.components.explore.ExploreBookCoverKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import l2.x0;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import p3.b1;
import p3.d1;
import q2.j7;
import q2.y2;
import r1.d2;
import r1.p2;
import r1.u0;
import rd.c1;
import s4.y0;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a]\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0016\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aC\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010$\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001a!\u0010&\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010)\u001a\u000f\u0010*\u001a\u00020\u0003H\u0007¢\u0006\u0004\b*\u0010)\u001a\u000f\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b+\u0010)\"\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u00100\u001a\u00020/8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00101¨\u00063²\u0006\u000e\u00102\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lkotlin/Function1;", "", "onCreated", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CreateCollectionViewModel;", "vm", "CreateCollectionSheet", "(Lio/elevenlabs/domain/model/ReadMeta;Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CreateCollectionViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CreateCollectionState;", RemoteConfigConstants.ResponseFieldKey.STATE, "onNameChange", "Lio/elevenlabs/domain/model/CollectionMeta$Icon;", "onIconSelect", "onSubmit", "CreateCollectionSheetUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CreateCollectionState;Lio/elevenlabs/domain/model/ReadMeta;Lho/l;Lho/l;Lho/a;Lu2/m;II)V", "Li3/t;", "modifier", "CollectionHeaderImage", "(Lio/elevenlabs/domain/model/ReadMeta;Li3/t;Lu2/m;II)V", "value", "onValueChange", "CollectionNameField", "(Ljava/lang/String;Lho/l;Lho/a;Li3/t;Lu2/m;II)V", "selected", "onSelect", "CollectionIconRow", "(Lio/elevenlabs/domain/model/CollectionMeta$Icon;Lho/l;Lu2/m;I)V", ParameterNames.ICON, "", "isSelected", "onClick", "CollectionIconCell", "(Lio/elevenlabs/domain/model/CollectionMeta$Icon;ZLho/a;Lu2/m;I)V", "PreviewSheet", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CreateCollectionState;Lio/elevenlabs/domain/model/ReadMeta;Lu2/m;I)V", "Preview_CreateCollectionSheet_Library_Empty", "(Lu2/m;I)V", "Preview_CreateCollectionSheet_ReadDetails_Filled", "Preview_CreateCollectionSheet_Loading", "", "IconRowOrder", "Ljava/util/List;", "", "MAX_COLLECTION_NAME_LENGTH", TokenNames.I, DiagnosticsEntry.NAME_KEY, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CreateCollectionSheetKt {
    private static final List<CollectionMeta.Icon> IconRowOrder;
    private static final int MAX_COLLECTION_NAME_LENGTH = 100;

    static {
        Collection entries = CollectionMeta.Icon.getEntries();
        IconRowOrder = tn.o.O0(tn.o.b1(entries, ((tn.a) entries).b() / 2), tn.o.q0(entries, ((tn.a) entries).b() / 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CollectionHeaderImage(ReadMeta readMeta, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        i3.t tVar5;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1132783683);
        if ((i10 & 6) == 0) {
            if (qVar.h(readMeta)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i15 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                i3.t f10 = p2.f(tVar4, 210);
                f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(f10, qVar);
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
                if (readMeta != null) {
                    qVar.X(-1246877948);
                    tVar5 = tVar4;
                    ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(ReadMetaKt.coverImageUrl(readMeta, CoverImageSize.Medium), BookCoverSize.Large, null, 140, true, false, 0L, 0L, null, null, null, false, readMeta.getBlurPlaceholder(), readMeta.getCoverAspectRatio(), false, null, qVar, 27696, 0, 53220);
                    qVar = qVar;
                    qVar.p(false);
                } else {
                    tVar5 = tVar4;
                    qVar.X(-1246521758);
                    l1.n.c(kd.a.M(R.drawable.collection_header_placeholder, qVar, 0), null, null, null, f4.q.f8840c, t2.u.P, null, qVar, u3.c.$stable | 24624, 108);
                    qVar.p(false);
                }
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.g0(readMeta, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z CollectionHeaderImage$lambda$1(ReadMeta readMeta, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        CollectionHeaderImage(readMeta, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void CollectionIconCell(CollectionMeta.Icon icon, boolean z6, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        i3.t tVar;
        long quaternary;
        int i12;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-922232707);
        if ((i10 & 6) == 0) {
            if (qVar.d(icon.ordinal())) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
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
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            b1 xl2 = echoTheme.getShapes(qVar, i15).getXl(qVar, EchoThemeShapes.$stable);
            i3.q qVar2 = i3.q.f13017a;
            i3.t h10 = l1.n.h(m3.h.c(p2.o(qVar2, 48), xl2), echoTheme.getColors(qVar, i15).getFill().getUndenaryAlpha(qVar, EchoThemeColors.Fill.$stable), p3.h0.f26395b);
            if (z6) {
                qVar.X(-1502357649);
                tVar = l1.n.j(2, echoTheme.getColors(qVar, i15).getBorder().getHeavy(qVar, EchoThemeColors.Border.$stable), qVar2, xl2);
                qVar.p(false);
            } else {
                qVar.X(-1502355899);
                qVar.p(false);
                tVar = qVar2;
            }
            i3.t b10 = y1.c.b(h10.then(tVar), z6, new p4.k(3), aVar);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(b10, qVar);
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
            u3.c M = kd.a.M(RememberCollectionIconKt.rememberCollectionIcon("", icon, qVar, ((i11 << 3) & 112) | 6), qVar, 0);
            String name = icon.name();
            if (z6) {
                qVar.X(1351536266);
                quaternary = echoTheme.getColors(qVar, i15).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable);
            } else {
                qVar.X(1351537389);
                quaternary = echoTheme.getColors(qVar, i15).getIcon().getQuaternary(qVar, EchoThemeColors.Icon.$stable);
            }
            qVar.p(false);
            y2.a(M, name, p2.o(qVar2, 20), quaternary, qVar, u3.c.$stable | 384, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.e(icon, z6, aVar, i10);
        }
    }

    public static final sn.z CollectionIconCell$lambda$1(CollectionMeta.Icon icon, boolean z6, ho.a aVar, int i10, u2.m mVar, int i11) {
        CollectionIconCell(icon, z6, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void CollectionIconRow(CollectionMeta.Icon icon, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(768672276);
        if ((i10 & 6) == 0) {
            if (qVar.d(icon.ordinal())) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
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
            t1.z a10 = t1.b0.a(0, qVar, 3);
            boolean f10 = qVar.f(a10);
            int i14 = i11 & 14;
            if (i14 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z13 = f10 | z10;
            Object L = qVar.L();
            Object obj = u2.l.f33918a;
            if (z13 || L == obj) {
                L = new CreateCollectionSheetKt$CollectionIconRow$1$1(a10, icon, null);
                qVar.h0(L);
            }
            u2.r.f((ho.p) L, sn.z.f31622a, qVar);
            i3.t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            d2 d10 = r1.d.d(echoTheme.getSpacings(qVar, i15).getX5(), t2.u.P, 2);
            u0 u0Var = r1.j.f29228a;
            r1.h g10 = r1.j.g(echoTheme.getSpacings(qVar, i15).getX5());
            if (i14 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i11 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z14 = z11 | z12;
            Object L2 = qVar.L();
            if (z14 || L2 == obj) {
                L2 = new f0(icon, lVar, 7);
                qVar.h0(L2);
            }
            c1.d(e10, a10, d10, g10, null, null, false, null, (ho.l) L2, qVar, 6, 488);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(icon, lVar, i10, 14);
        }
    }

    public static final sn.z CollectionIconRow$lambda$1$0(final CollectionMeta.Icon icon, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        final List<CollectionMeta.Icon> list = IconRowOrder;
        final y yVar = new y(11);
        final CreateCollectionSheetKt$CollectionIconRow$lambda$1$0$$inlined$items$default$1 createCollectionSheetKt$CollectionIconRow$lambda$1$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt$CollectionIconRow$lambda$1$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CollectionMeta.Icon) obj);
            }

            @Override // ho.l
            public final Void invoke(CollectionMeta.Icon icon2) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt$CollectionIconRow$lambda$1$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt$CollectionIconRow$lambda$1$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt$CollectionIconRow$lambda$1$0$$inlined$items$default$4
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
                    i12 = i14 | i11;
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
                boolean z10 = true;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final CollectionMeta.Icon icon2 = (CollectionMeta.Icon) list.get(i10);
                    qVar.X(1005591046);
                    if (icon2 != icon) {
                        z10 = false;
                    }
                    boolean f10 = qVar.f(lVar) | qVar.d(icon2.ordinal());
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt$CollectionIconRow$2$1$2$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1358invoke() {
                                ho.l.this.invoke(icon2);
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1358invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    CreateCollectionSheetKt.CollectionIconCell(icon2, z10, (ho.a) L, qVar, 0);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 802480018));
        return sn.z.f31622a;
    }

    public static final Object CollectionIconRow$lambda$1$0$0(CollectionMeta.Icon icon) {
        icon.getClass();
        return icon.name();
    }

    public static final sn.z CollectionIconRow$lambda$2(CollectionMeta.Icon icon, ho.l lVar, int i10, u2.m mVar, int i11) {
        CollectionIconRow(icon, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CollectionNameField(String str, ho.l lVar, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i14;
        int i15;
        int i16;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-24549809);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = new n3.v();
                    qVar.h0(L);
                }
                n3.v vVar = (n3.v) L;
                m2 m2Var = (m2) qVar.j(j1.f13137p);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i18 = EchoTheme.$stable;
                y0 xlRegular500 = echoTheme.getTypography(qVar, i18).getXlRegular500(qVar, EchoThemeTypography.$stable);
                EchoThemeColors.Text text = echoTheme.getColors(qVar, i18).getText();
                int i19 = EchoThemeColors.Text.$stable;
                y0 a10 = y0.a(xlRegular500, text.getPrimary(qVar, i19), 0L, null, null, null, 0L, 3, 0L, null, null, 16744446);
                long v9 = ib.i.v(i18, i19, echoTheme, qVar, qVar);
                x0 x0Var = new x0(v9, echoTheme.getColors(qVar, i18).getFill().getSecondary(qVar, EchoThemeColors.Fill.$stable));
                String R = kj.c.R(qVar, R.string.new_collection_name_placeholder);
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = new CreateCollectionSheetKt$CollectionNameField$1$1(vVar, null);
                    qVar.h0(L2);
                }
                u2.r.f((ho.p) L2, sn.z.f31622a, qVar);
                u2.r.a(l2.y0.f21297a.a(x0Var), c3.k.d(1679608591, true, new gs.l(v9, m2Var, aVar, tVar4, vVar, str, lVar, a10, R), qVar), qVar, 56);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new k0(str, lVar, aVar, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z CollectionNameField$lambda$2(long j4, m2 m2Var, ho.a aVar, i3.t tVar, n3.v vVar, String str, ho.l lVar, y0 y0Var, String str2, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            d1 d1Var = new d1(j4);
            a2 a2Var = new a2(0, 7, 119);
            boolean f10 = qVar.f(m2Var) | qVar.f(aVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f10 || L == eVar) {
                L = new f0(m2Var, aVar, 6);
                qVar.h0(L);
            }
            z1 z1Var = new z1((ho.l) L, null, null, 62);
            i3.t j10 = n3.d.j(p2.e(tVar, 1.0f), vVar);
            boolean f11 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                L2 = new b0(lVar, 5);
                qVar.h0(L2);
            }
            a2.v.a(str, (ho.l) L2, j10, false, y0Var, a2Var, z1Var, true, 0, 0, null, null, null, d1Var, c3.k.d(143355020, true, new fm.o(str, (Object) str2, (Object) y0Var, 9), qVar), qVar, 102236160, 196608, 15896);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CollectionNameField$lambda$2$0$0(m2 m2Var, ho.a aVar, y1 y1Var) {
        y1Var.getClass();
        if (m2Var != null) {
            ((l1) m2Var).a();
        }
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z CollectionNameField$lambda$2$1$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(wq.n.J0(100, str));
        return sn.z.f31622a;
    }

    public static final sn.z CollectionNameField$lambda$2$2(String str, String str2, y0 y0Var, ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        pVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).h(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            if (str.length() == 0) {
                qVar2.X(-2145191595);
                j7.d(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0.a(y0Var, EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getText().getTertiary(qVar2, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar2, 0, 0, 131070);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                qVar.X(-2144981136);
                qVar.p(false);
            }
            j0.c.q(i11 & 14, pVar, qVar, true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CollectionNameField$lambda$3(String str, ho.l lVar, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        CollectionNameField(str, lVar, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if ((r24 & 8) != 0) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateCollectionSheet(ReadMeta readMeta, ho.a aVar, ho.l lVar, CreateCollectionViewModel createCollectionViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        CreateCollectionViewModel createCollectionViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1867143202);
        if ((i10 & 6) == 0) {
            if (qVar.h(readMeta)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                createCollectionViewModel2 = createCollectionViewModel;
                if (qVar.h(createCollectionViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                createCollectionViewModel2 = createCollectionViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            createCollectionViewModel2 = createCollectionViewModel;
        }
        boolean z10 = false;
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 8) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        createCollectionViewModel2 = (CreateCollectionViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(CreateCollectionViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                CreateCollectionViewModel createCollectionViewModel3 = createCollectionViewModel2;
                qVar.q();
                CreateCollectionState createCollectionState = (CreateCollectionState) u2.r.o(createCollectionViewModel3.getStateFlow(), qVar, 0).getValue();
                boolean h10 = qVar.h(createCollectionViewModel3);
                if ((i12 & 112) == 32) {
                    z10 = true;
                }
                boolean z11 = h10 | z10;
                Object L = qVar.L();
                if (z11 || L == u2.l.f33918a) {
                    L = new a(createCollectionViewModel3, aVar, 4);
                    qVar.h0(L);
                }
                ho.q m1344getLambda$177805088$app_productionRelease = ComposableSingletons$CreateCollectionSheetKt.INSTANCE.m1344getLambda$177805088$app_productionRelease();
                io.elevenlabs.readerapp.core.router.g gVar = new io.elevenlabs.readerapp.core.router.g(createCollectionState, lVar, createCollectionViewModel3, readMeta, 3);
                createCollectionViewModel2 = createCollectionViewModel3;
                BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, (ho.a) L, null, false, null, m1344getLambda$177805088$app_productionRelease, c3.k.d(142608945, true, gVar, qVar), qVar, 1769472, 29);
                qVar = qVar;
            }
        } else {
            qVar.R();
        }
        CreateCollectionViewModel createCollectionViewModel4 = createCollectionViewModel2;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) readMeta, (Object) aVar, lVar, (Object) createCollectionViewModel4, i10, i11, 14);
        }
    }

    public static final sn.z CreateCollectionSheet$lambda$0$0(CreateCollectionViewModel createCollectionViewModel, ho.a aVar) {
        createCollectionViewModel.onDismissed();
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z CreateCollectionSheet$lambda$1(CreateCollectionState createCollectionState, ho.l lVar, CreateCollectionViewModel createCollectionViewModel, ReadMeta readMeta, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        String createdCollectionId = createCollectionState.getCreatedCollectionId();
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(createCollectionState) | qVar.f(lVar) | qVar.h(createCollectionViewModel) | qVar.h(bottomSheetControl);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            CreateCollectionSheetKt$CreateCollectionSheet$2$1$1 createCollectionSheetKt$CreateCollectionSheet$2$1$1 = new CreateCollectionSheetKt$CreateCollectionSheet$2$1$1(createCollectionState, lVar, createCollectionViewModel, bottomSheetControl, null);
            qVar.h0(createCollectionSheetKt$CreateCollectionSheet$2$1$1);
            L = createCollectionSheetKt$CreateCollectionSheet$2$1$1;
        }
        u2.r.f((ho.p) L, createdCollectionId, qVar);
        boolean h10 = qVar.h(createCollectionViewModel);
        Object L2 = qVar.L();
        if (h10 || L2 == eVar) {
            L2 = new CreateCollectionSheetKt$CreateCollectionSheet$2$2$1(createCollectionViewModel);
            qVar.h0(L2);
        }
        ho.l lVar2 = (ho.l) L2;
        boolean h11 = qVar.h(createCollectionViewModel);
        Object L3 = qVar.L();
        if (h11 || L3 == eVar) {
            L3 = new CreateCollectionSheetKt$CreateCollectionSheet$2$3$1(createCollectionViewModel);
            qVar.h0(L3);
        }
        ho.l lVar3 = (ho.l) L3;
        boolean h12 = qVar.h(createCollectionViewModel) | qVar.h(readMeta);
        Object L4 = qVar.L();
        if (h12 || L4 == eVar) {
            L4 = new a(createCollectionViewModel, readMeta, 5);
            qVar.h0(L4);
        }
        CreateCollectionSheetUI(createCollectionState, readMeta, lVar2, lVar3, (ho.a) L4, qVar, 0, 0);
        return sn.z.f31622a;
    }

    public static final sn.z CreateCollectionSheet$lambda$1$3$0(CreateCollectionViewModel createCollectionViewModel, ReadMeta readMeta) {
        String str;
        if (readMeta != null) {
            str = readMeta.getReadId();
        } else {
            str = null;
        }
        createCollectionViewModel.submit(str);
        return sn.z.f31622a;
    }

    public static final sn.z CreateCollectionSheet$lambda$2(ReadMeta readMeta, ho.a aVar, ho.l lVar, CreateCollectionViewModel createCollectionViewModel, int i10, int i11, u2.m mVar, int i12) {
        CreateCollectionSheet(readMeta, aVar, lVar, createCollectionViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CreateCollectionSheetUI(CreateCollectionState createCollectionState, ReadMeta readMeta, ho.l lVar, ho.l lVar2, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        int i14;
        ho.l lVar4;
        int i15;
        int i16;
        ho.a aVar2;
        int i17;
        boolean z6;
        ho.l lVar5;
        ho.l lVar6;
        ho.a aVar3;
        r1 r10;
        ho.l lVar7;
        ho.l lVar8;
        ho.a aVar4;
        boolean z10;
        ho.l lVar9;
        boolean z11;
        int i18;
        int i19;
        int i20;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(526440238);
        if ((i10 & 6) == 0) {
            if (qVar.f(createCollectionState)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(readMeta)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            lVar3 = lVar;
            if (qVar.h(lVar3)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                lVar4 = lVar2;
                if (qVar.h(lVar4)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    aVar2 = aVar;
                    if (qVar.h(aVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    if ((i12 & 9363) == 9362) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar.O(i12 & 1, z6)) {
                        u2.e eVar = u2.l.f33918a;
                        if (i21 != 0) {
                            Object L = qVar.L();
                            if (L == eVar) {
                                L = new y(9);
                                qVar.h0(L);
                            }
                            lVar7 = (ho.l) L;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i14 != 0) {
                            Object L2 = qVar.L();
                            if (L2 == eVar) {
                                L2 = new y(10);
                                qVar.h0(L2);
                            }
                            lVar8 = (ho.l) L2;
                        } else {
                            lVar8 = lVar4;
                        }
                        if (i16 != 0) {
                            Object L3 = qVar.L();
                            if (L3 == eVar) {
                                L3 = new b(7);
                                qVar.h0(L3);
                            }
                            aVar4 = (ho.a) L3;
                        } else {
                            aVar4 = aVar2;
                        }
                        i3.q qVar2 = i3.q.f13017a;
                        i3.t y10 = l1.n.y(p2.e(qVar2, 1.0f), l1.n.x(qVar), true, true);
                        r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                        ho.l lVar10 = lVar7;
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l4 = qVar.l();
                        i3.t c5 = i3.a.c(y10, qVar);
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
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        int i22 = EchoTheme.$stable;
                        ib.i.z(echoTheme, qVar, i22, qVar2, qVar);
                        CollectionHeaderImage(readMeta, new r1.x0(i3.d.C0), qVar, (i12 >> 3) & 14, 0);
                        r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i22).getX9()), qVar);
                        ho.l lVar11 = lVar8;
                        boolean z12 = false;
                        aVar3 = aVar4;
                        j7.d(kj.c.R(qVar, R.string.new_collection_name_prompt), r1.d.G(p2.e(qVar2, 1.0f), echoTheme.getSpacings(qVar, i22).getX5(), t2.u.P, 2), echoTheme.getColors(qVar, i22).getText().getQuaternary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i22).getBaseRegular400(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 130040);
                        r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i22).getX2()), qVar);
                        Object L4 = qVar.L();
                        if (L4 == eVar) {
                            L4 = u2.r.A(createCollectionState.getName());
                            qVar.h0(L4);
                        }
                        z0 z0Var = (z0) L4;
                        String CreateCollectionSheetUI$lambda$3$1 = CreateCollectionSheetUI$lambda$3$1(z0Var);
                        if ((i12 & 896) == 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Object L5 = qVar.L();
                        if (!z10 && L5 != eVar) {
                            lVar9 = lVar10;
                        } else {
                            lVar9 = lVar10;
                            L5 = new i(lVar9, z0Var, 1);
                            qVar.h0(L5);
                        }
                        ho.l lVar12 = (ho.l) L5;
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((57344 & i12) == 16384) {
                            z12 = true;
                        }
                        boolean z13 = z11 | z12;
                        Object L6 = qVar.L();
                        if (z13 || L6 == eVar) {
                            L6 = new c3.b(createCollectionState, aVar3, z0Var, 14);
                            qVar.h0(L6);
                        }
                        CollectionNameField(CreateCollectionSheetUI$lambda$3$1, lVar12, (ho.a) L6, r1.d.G(qVar2, echoTheme.getSpacings(qVar, i22).getX5(), t2.u.P, 2), qVar, 0, 0);
                        r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i22).getX8()), qVar);
                        CollectionIconRow(createCollectionState.getIcon(), lVar11, qVar, (i12 >> 6) & 112);
                        r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i22).getX8()), qVar);
                        if (readMeta != null) {
                            i18 = R.string.add_collection_title;
                        } else {
                            i18 = R.string.new_collection_create;
                        }
                        EchoButtonKt.m1835EchoButton562pCRU(kj.c.R(qVar, i18), aVar3, r1.d.F(qVar2, echoTheme.getSpacings(qVar, i22).getX5(), echoTheme.getSpacings(qVar, i22).getX4()), EchoButtonVariant.Primary, EchoButtonSize.Large, null, !wq.n.m0(CreateCollectionSheetUI$lambda$3$1(z0Var)), true, null, createCollectionState.isLoading(), false, qVar, ((i12 >> 9) & 112) | 12610560, 0, 1312);
                        qVar = qVar;
                        qVar.p(true);
                        lVar5 = lVar9;
                        lVar6 = lVar11;
                    } else {
                        qVar.R();
                        lVar5 = lVar3;
                        lVar6 = lVar4;
                        aVar3 = aVar2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(createCollectionState, readMeta, lVar5, lVar6, aVar3, i10, i11);
                        return;
                    }
                    return;
                }
                aVar2 = aVar;
                if ((i12 & 9363) == 9362) {
                }
                if (!qVar.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar4 = lVar2;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            aVar2 = aVar;
            if ((i12 & 9363) == 9362) {
            }
            if (!qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        lVar3 = lVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        lVar4 = lVar2;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        aVar2 = aVar;
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z CreateCollectionSheetUI$lambda$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z CreateCollectionSheetUI$lambda$1$0(CollectionMeta.Icon icon) {
        icon.getClass();
        return sn.z.f31622a;
    }

    private static final String CreateCollectionSheetUI$lambda$3$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z CreateCollectionSheetUI$lambda$3$3$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(str);
        return sn.z.f31622a;
    }

    public static final sn.z CreateCollectionSheetUI$lambda$3$4$0(CreateCollectionState createCollectionState, ho.a aVar, z0 z0Var) {
        if (!wq.n.m0(CreateCollectionSheetUI$lambda$3$1(z0Var)) && !createCollectionState.isLoading()) {
            aVar.invoke();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CreateCollectionSheetUI$lambda$4(CreateCollectionState createCollectionState, ReadMeta readMeta, ho.l lVar, ho.l lVar2, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        CreateCollectionSheetUI(createCollectionState, readMeta, lVar, lVar2, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void PreviewSheet(CreateCollectionState createCollectionState, ReadMeta readMeta, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(13445966);
        if ((i10 & 6) == 0) {
            if (qVar.f(createCollectionState)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(readMeta)) {
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
            EchoTheme.INSTANCE.invoke(null, c3.k.d(-641913420, true, new w(createCollectionState, readMeta, 2), qVar), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(createCollectionState, readMeta, i10, 13);
        }
    }

    public static final sn.z PreviewSheet$lambda$0(CreateCollectionState createCollectionState, ReadMeta readMeta, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(p2.e(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
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
            if (L == u2.l.f33918a) {
                L = new b(6);
                qVar.h0(L);
            }
            CenteredCloseHeaderKt.CenteredCloseHeader("Create a collection", (ho.a) L, qVar, 54);
            CreateCollectionSheetUI(createCollectionState, readMeta, null, null, null, qVar, 0, 28);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PreviewSheet$lambda$1(CreateCollectionState createCollectionState, ReadMeta readMeta, int i10, u2.m mVar, int i11) {
        PreviewSheet(createCollectionState, readMeta, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CreateCollectionSheet_Library_Empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1336061113);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewSheet(new CreateCollectionState(null, null, false, null, 15, null), null, qVar, 48);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 5);
        }
    }

    public static final sn.z Preview_CreateCollectionSheet_Library_Empty$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_CreateCollectionSheet_Library_Empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CreateCollectionSheet_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1721291590);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewSheet(new CreateCollectionState("Weekend reads", CollectionMeta.Icon.Star, true, null, 8, null), null, qVar, 48);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 6);
        }
    }

    public static final sn.z Preview_CreateCollectionSheet_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_CreateCollectionSheet_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CreateCollectionSheet_ReadDetails_Filled(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-297385873);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CreateCollectionState createCollectionState = new CreateCollectionState("Weekend reads", CollectionMeta.Icon.Bookmark, false, null, 12, null);
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            Map singletonMap = Collections.singletonMap(CoverImageSize.Medium.getKey(), "https://example.com/cover.jpg");
            singletonMap.getClass();
            copy = stubReadMeta$default.copy((r84 & 1) != 0 ? stubReadMeta$default.articleImageUrl : null, (r84 & 2) != 0 ? stubReadMeta$default.author : null, (r84 & 4) != 0 ? stubReadMeta$default.chapters : null, (r84 & 8) != 0 ? stubReadMeta$default.charCount : 0L, (r84 & 16) != 0 ? stubReadMeta$default.createdAt : null, (r84 & 32) != 0 ? stubReadMeta$default.updatedAt : null, (r84 & 64) != 0 ? stubReadMeta$default.addedAt : null, (r84 & 128) != 0 ? stubReadMeta$default.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? stubReadMeta$default.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.source : null, (r84 & 2048) != 0 ? stubReadMeta$default.title : null, (r84 & 4096) != 0 ? stubReadMeta$default.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.url : null, (r84 & 16384) != 0 ? stubReadMeta$default.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.originalFileType : null, (r84 & 65536) != 0 ? stubReadMeta$default.hasOriginalAudio : false, (r84 & 131072) != 0 ? stubReadMeta$default.matureContent : false, (r84 & 262144) != 0 ? stubReadMeta$default.origin : null, (r84 & 524288) != 0 ? stubReadMeta$default.contentType : null, (r84 & 1048576) != 0 ? stubReadMeta$default.genre : null, (r84 & 2097152) != 0 ? stubReadMeta$default.isBookType : false, (r84 & 4194304) != 0 ? stubReadMeta$default.fromUserImport : false, (r84 & 8388608) != 0 ? stubReadMeta$default.rating : null, (r84 & 16777216) != 0 ? stubReadMeta$default.userRating : null, (r84 & 33554432) != 0 ? stubReadMeta$default.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? stubReadMeta$default.creationStatus : null, (r84 & 134217728) != 0 ? stubReadMeta$default.creationProgress : null, (r84 & 268435456) != 0 ? stubReadMeta$default.isArchived : false, (r84 & 536870912) != 0 ? stubReadMeta$default.markedAsUnread : false, (r84 & 1073741824) != 0 ? stubReadMeta$default.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? stubReadMeta$default.publicationDate : null, (r85 & 1) != 0 ? stubReadMeta$default.language : null, (r85 & 2) != 0 ? stubReadMeta$default.publisherProfileId : null, (r85 & 4) != 0 ? stubReadMeta$default.canDelete : false, (r85 & 8) != 0 ? stubReadMeta$default.androidProductId : null, (r85 & 16) != 0 ? stubReadMeta$default.isPaid : false, (r85 & 32) != 0 ? stubReadMeta$default.offlineReadData : null, (r85 & 64) != 0 ? stubReadMeta$default.previewAudio : null, (r85 & 128) != 0 ? stubReadMeta$default.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.voiceSelectionConfig : null, (r85 & 512) != 0 ? stubReadMeta$default.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.displayMode : null, (r85 & 2048) != 0 ? stubReadMeta$default.inUserLibrary : false, (r85 & 4096) != 0 ? stubReadMeta$default.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.audioType : null, (r85 & 16384) != 0 ? stubReadMeta$default.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? stubReadMeta$default.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? stubReadMeta$default.audioDurationSeconds : null, (r85 & 262144) != 0 ? stubReadMeta$default.audioTypes : null, (r85 & 524288) != 0 ? stubReadMeta$default.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? stubReadMeta$default.lastUsedAudioType : null, (r85 & 2097152) != 0 ? stubReadMeta$default.coverImageUrls : singletonMap, (r85 & 4194304) != 0 ? stubReadMeta$default.coverAspectRatio : Double.valueOf(0.6666666666666666d), (r85 & 8388608) != 0 ? stubReadMeta$default.blurPlaceholder : null);
            PreviewSheet(createCollectionState, copy, qVar, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 7);
        }
    }

    public static final sn.z Preview_CreateCollectionSheet_ReadDetails_Filled$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_CreateCollectionSheet_ReadDetails_Filled(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
