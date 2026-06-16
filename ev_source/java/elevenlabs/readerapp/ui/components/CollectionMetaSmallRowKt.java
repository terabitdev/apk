package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.readerapp.ui.previews.CollectionFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.RowWithInvertedMeasurementKt;
import io.elevenlabs.ui.components.UnreadIndicatorKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aM\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/CollectionMeta;", "meta", "", "displayChevron", "Lsn/z;", "CollectionMetaSmallRow", "(Lio/elevenlabs/domain/model/CollectionMeta;ZLu2/m;II)V", "", "title", "", "iconRes", "unreadIndicator", "", "counter", "imageUrl", "CollectionRow", "(Ljava/lang/String;IZLjava/lang/Long;Ljava/lang/String;ZLu2/m;II)V", "Preview_CollectionMetaSmallRow", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CollectionMetaSmallRowKt {
    public static final void CollectionMetaSmallRow(CollectionMeta collectionMeta, boolean z6, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        collectionMeta.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-554929788);
        if ((i10 & 6) == 0) {
            if (qVar.h(collectionMeta)) {
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
            if (qVar.g(z6)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        boolean z12 = true;
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i12 & 1, z10)) {
            if (i15 == 0) {
                z12 = z6;
            }
            String imageUrl = collectionMeta.getImageUrl();
            CollectionRow(collectionMeta.getTitle(), RememberCollectionIconKt.rememberCollectionIcon(collectionMeta.getId(), collectionMeta.getIcon(), qVar, 0), collectionMeta.getHasUnread(), collectionMeta.getItemCount(), imageUrl, z12, qVar, 458752 & (i12 << 12), 0);
            z11 = z12;
        } else {
            qVar.R();
            z11 = z6;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i(collectionMeta, z11, i10, i11, 0);
        }
    }

    public static final sn.z CollectionMetaSmallRow$lambda$0(CollectionMeta collectionMeta, boolean z6, int i10, int i11, u2.m mVar, int i12) {
        CollectionMetaSmallRow(collectionMeta, z6, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0057  */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CollectionRow(String str, final int i10, boolean z6, Long l4, String str2, boolean z10, u2.m mVar, final int i11, final int i12) {
        int i13;
        boolean z11;
        int i14;
        int i15;
        Long l7;
        int i16;
        int i17;
        String str3;
        int i18;
        int i19;
        boolean z12;
        int i20;
        boolean z13;
        String str4;
        final boolean z14;
        final Long l10;
        final String str5;
        final boolean z15;
        u2.q qVar;
        r1 r10;
        Long l11;
        String str6;
        boolean z16;
        i3.q qVar2;
        float f10;
        ?? r52;
        u2.q qVar3;
        ElevenLabsTheme elevenLabsTheme;
        int i21;
        int i22;
        str.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-1987732452);
        if ((i11 & 6) == 0) {
            if (qVar4.f(str)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i13 = i22 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar4.d(i10)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i13 |= i21;
        }
        int i23 = i12 & 4;
        if (i23 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            z11 = z6;
            if (qVar4.g(z11)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i13 |= i14;
            i15 = i12 & 8;
            if (i15 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                l7 = l4;
                if (qVar4.f(l7)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i13 |= i16;
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    str3 = str2;
                    if (qVar4.f(str3)) {
                        i18 = 16384;
                    } else {
                        i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i13 |= i18;
                    i19 = i12 & 32;
                    if (i19 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        z12 = z10;
                        if (qVar4.g(z12)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i13 |= i20;
                        if ((74899 & i13) != 74898) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (qVar4.O(i13 & 1, z13)) {
                            if (i23 != 0) {
                                z11 = false;
                            }
                            String str7 = null;
                            if (i15 != 0) {
                                l11 = null;
                            } else {
                                l11 = l7;
                            }
                            if (i17 == 0) {
                                str7 = str3;
                            }
                            if (i19 != 0) {
                                z12 = true;
                            }
                            i3.q qVar5 = i3.q.f13017a;
                            i3.t e10 = p2.e(qVar5, 1.0f);
                            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar4, 0);
                            String str8 = str7;
                            int hashCode = Long.hashCode(qVar4.T);
                            c3.o l12 = qVar4.l();
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
                            u2.r.J(eVar2, l12, qVar4);
                            Integer valueOf = Integer.valueOf(hashCode);
                            h4.e eVar3 = h4.g.f11908g;
                            u2.r.y(qVar4, valueOf, eVar3);
                            h4.d dVar = h4.g.f11909h;
                            u2.r.F(dVar, qVar4);
                            int i24 = i13;
                            h4.e eVar4 = h4.g.f11905d;
                            u2.r.J(eVar4, c5, qVar4);
                            i3.t e11 = p2.e(qVar5, 1.0f);
                            boolean z17 = z12;
                            ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                            int i25 = ElevenLabsTheme.$stable;
                            i3.t f11 = ib.i.f(elevenLabsTheme2, qVar4, i25, e11);
                            i3.k kVar = i3.d.f13005z0;
                            boolean z18 = z11;
                            k2 a11 = i2.a(r1.j.f29228a, kVar, qVar4, 48);
                            Long l13 = l11;
                            int hashCode2 = Long.hashCode(qVar4.T);
                            c3.o l14 = qVar4.l();
                            i3.t c10 = i3.a.c(f11, qVar4);
                            qVar4.b0();
                            if (qVar4.S) {
                                qVar4.k(fVar);
                            } else {
                                qVar4.k0();
                            }
                            u2.r.J(eVar, a11, qVar4);
                            u2.r.J(eVar2, l14, qVar4);
                            defpackage.f.u(hashCode2, qVar4, eVar3, qVar4, dVar);
                            u2.r.J(eVar4, c10, qVar4);
                            if (str8 != null) {
                                qVar4.X(-2043234540);
                                ad.h hVar = new ad.h((Context) qVar4.j(AndroidCompositionLocals_androidKt.f2291b));
                                str6 = str8;
                                hVar.f1788c = str6;
                                hVar.b();
                                qVar3 = qVar4;
                                elevenLabsTheme = elevenLabsTheme2;
                                r52 = 1;
                                qVar2 = qVar5;
                                f10 = 1.0f;
                                z16 = z17;
                                qc.m.b(hVar.a(), null, m3.h.c(p2.o(qVar5, elevenLabsTheme2.getSpacings(qVar4, i25).m2360getX8D9Ej5fM()), elevenLabsTheme2.getShapes(qVar4, i25).getMd()), null, f4.q.f8839b, null, qVar3, 1572912, 4024);
                                qVar3.p(false);
                            } else {
                                str6 = str8;
                                z16 = z17;
                                qVar2 = qVar5;
                                ElevenLabsTheme elevenLabsTheme3 = elevenLabsTheme2;
                                f10 = 1.0f;
                                r52 = 1;
                                qVar4.X(-2042715538);
                                y2.a(kd.a.M(i10, qVar4, (i24 >> 3) & 14), null, p2.o(qVar2, elevenLabsTheme3.getSpacings(qVar4, i25).m2360getX8D9Ej5fM()), defpackage.f.b(elevenLabsTheme3, qVar4, i25), qVar4, u3.c.$stable | 48, 0);
                                qVar3 = qVar4;
                                qVar3.p(false);
                                elevenLabsTheme = elevenLabsTheme3;
                            }
                            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar3, i25).m2357getX5D9Ej5fM()), qVar3);
                            if (f10 <= 0.0d) {
                                s1.a.a("invalid weight; must be greater than zero");
                            }
                            str4 = str;
                            u2.q qVar6 = qVar3;
                            RowWithInvertedMeasurementKt.RowWithInvertedMeasurement(new m1(f10, r52), null, kVar, c3.k.d(1270389123, r52, new j(str4, l13, z16, z18), qVar3), qVar6, 3456, 2);
                            u2.q qVar7 = qVar6;
                            qVar7.p(r52);
                            r1.d.g(l1.n.h(r1.d.G(p2.e(p2.f(qVar2, (float) r52), f10), elevenLabsTheme.getSpacings(qVar7, i25).m2357getX5D9Ej5fM(), t2.u.P, 2), elevenLabsTheme.getColor(qVar7, i25).getDivider().m2058getLightLine0d7_KjU(), p3.h0.f26395b), qVar7);
                            qVar7.p(r52);
                            z15 = z16;
                            str5 = str6;
                            z14 = z18;
                            l10 = l13;
                            qVar = qVar7;
                        } else {
                            str4 = str;
                            u2.q qVar8 = qVar4;
                            qVar8.R();
                            z14 = z11;
                            l10 = l7;
                            str5 = str3;
                            z15 = z12;
                            qVar = qVar8;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            final String str9 = str4;
                            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.k
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    sn.z CollectionRow$lambda$1;
                                    int intValue = ((Integer) obj2).intValue();
                                    CollectionRow$lambda$1 = CollectionMetaSmallRowKt.CollectionRow$lambda$1(str9, i10, z14, l10, str5, z15, i11, i12, (u2.m) obj, intValue);
                                    return CollectionRow$lambda$1;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    z12 = z10;
                    if ((74899 & i13) != 74898) {
                    }
                    if (qVar4.O(i13 & 1, z13)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                str3 = str2;
                i19 = i12 & 32;
                if (i19 == 0) {
                }
                z12 = z10;
                if ((74899 & i13) != 74898) {
                }
                if (qVar4.O(i13 & 1, z13)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            l7 = l4;
            i17 = i12 & 16;
            if (i17 != 0) {
            }
            str3 = str2;
            i19 = i12 & 32;
            if (i19 == 0) {
            }
            z12 = z10;
            if ((74899 & i13) != 74898) {
            }
            if (qVar4.O(i13 & 1, z13)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        z11 = z6;
        i15 = i12 & 8;
        if (i15 == 0) {
        }
        l7 = l4;
        i17 = i12 & 16;
        if (i17 != 0) {
        }
        str3 = str2;
        i19 = i12 & 32;
        if (i19 == 0) {
        }
        z12 = z10;
        if ((74899 & i13) != 74898) {
        }
        if (qVar4.O(i13 & 1, z13)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z CollectionRow$lambda$0$0$0(boolean z6, boolean z10, Long l4, String str, l2 l2Var, u2.m mVar, int i10) {
        int i11;
        boolean z11;
        long j4;
        int i12;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z11)) {
            i3.q qVar2 = i3.q.f13017a;
            if (z6) {
                qVar.X(-1089380888);
                y2.a(kd.a.M(R.drawable.chevron_right, qVar, 0), null, p2.o(qVar2, 15), ib.i.w(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), qVar, u3.c.$stable | 432, 0);
                qVar.p(false);
            } else {
                qVar.X(-1089094913);
                qVar.p(false);
            }
            if (z10) {
                qVar.X(-1089051916);
                r1.d.g(p2.s(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2353getX2D9Ej5fM()), qVar);
                UnreadIndicatorKt.UnreadIndicator(qVar, 0);
                qVar.p(false);
            } else {
                if (l4 != null) {
                    j4 = l4.longValue();
                } else {
                    j4 = 0;
                }
                if (j4 > 0) {
                    qVar.X(-1088876394);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i13 = ElevenLabsTheme.$stable;
                    r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2353getX2D9Ej5fM()), qVar);
                    j7.d(String.valueOf(l4), null, ib.i.w(elevenLabsTheme, qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodySmall500(), qVar, 0, 0, 131066);
                    qVar = qVar;
                    qVar.p(false);
                } else {
                    qVar.X(-1088560225);
                    qVar.p(false);
                }
            }
            ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
            int i14 = ElevenLabsTheme.$stable;
            r1.d.g(p2.s(qVar2, elevenLabsTheme2.getSpacings(qVar, i14).m2357getX5D9Ej5fM()), qVar);
            r1.d.g(l2Var.b(qVar2, 1.0f, true), qVar);
            j7.d(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme2.getTypo(qVar, i14).getBodyLarge700(), qVar, 0, 24960, 110590);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CollectionRow$lambda$1(String str, int i10, boolean z6, Long l4, String str2, boolean z10, int i11, int i12, u2.m mVar, int i13) {
        CollectionRow(str, i10, z6, l4, str2, z10, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionMetaSmallRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-691542994);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.u0 u0Var = r1.j.f29228a;
            r1.h n2 = ib.i.n(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable);
            i3.t y10 = l1.n.y(i3.q.f13017a, l1.n.x(qVar), true, true);
            r1.x a10 = r1.w.a(n2, i3.d.B0, qVar, 0);
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
            CollectionMetaSmallRow(CollectionFactoryKt.stubCollectionMeta(), false, qVar, 0, 2);
            CollectionMetaSmallRow(CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, null, null, false, null, null, null, 5L, false, null, 3583, null), false, qVar, 0, 2);
            CollectionMetaSmallRow(CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, null, null, true, null, null, null, 5L, false, null, 3551, null), false, qVar, 0, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 29);
        }
    }

    public static final sn.z Preview_CollectionMetaSmallRow$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionMetaSmallRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
