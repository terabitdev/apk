package io.elevenlabs.readerapp.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.SizeableHeaderImage;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.MarkdownTextKt;
import io.elevenlabs.ui.components.MetaChipKt;
import io.elevenlabs.ui.components.MetaChipVariant;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a}\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "title", "Li3/t;", "modifier", "Lio/elevenlabs/domain/model/SizeableHeaderImage;", "image", "", "Lio/elevenlabs/readerapp/ui/components/Tag;", "tags", "author", "Lkotlin/Function0;", "Lsn/z;", "pricingContent", "onAuthorNameClick", "topPadding", "MediaHeaderSection", "(Ljava/lang/String;Li3/t;Lio/elevenlabs/domain/model/SizeableHeaderImage;Ljava/util/List;Ljava/lang/String;Lho/p;Lho/a;Lho/p;Lu2/m;II)V", "Preview_MediaHeaderSection", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaHeaderSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MediaHeaderSection(String str, i3.t tVar, SizeableHeaderImage sizeableHeaderImage, List<Tag> list, String str2, ho.p pVar, ho.a aVar, ho.p pVar2, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        SizeableHeaderImage sizeableHeaderImage2;
        int i15;
        int i16;
        List<Tag> list2;
        int i17;
        int i18;
        String str3;
        int i19;
        int i20;
        ho.p pVar3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z6;
        ho.p pVar4;
        SizeableHeaderImage sizeableHeaderImage3;
        u2.q qVar;
        List<Tag> list3;
        String str4;
        ho.p pVar5;
        ho.a aVar2;
        r1 r10;
        i3.t tVar3;
        String str5;
        ho.a aVar3;
        ho.p pVar6;
        i3.q qVar2;
        EchoTheme echoTheme;
        SizeableHeaderImage sizeableHeaderImage4;
        int i28;
        List<Tag> list4;
        i3.j jVar;
        i3.t tVar4;
        boolean z10;
        u2.q qVar3;
        boolean z11;
        int i29;
        str.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(184720499);
        if ((i10 & 6) == 0) {
            if (qVar4.f(str)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i12 = i29 | i10;
        } else {
            i12 = i10;
        }
        int i30 = i11 & 2;
        if (i30 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar4.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                sizeableHeaderImage2 = sizeableHeaderImage;
                if (qVar4.h(sizeableHeaderImage2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    list2 = list;
                    if (qVar4.h(list2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        str3 = str2;
                        if (qVar4.f(str3)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        i20 = i11 & 32;
                        if (i20 != 0) {
                            i12 |= 196608;
                        } else if ((196608 & i10) == 0) {
                            pVar3 = pVar;
                            if (qVar4.h(pVar3)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                            i22 = i11 & 64;
                            if (i22 == 0) {
                                i12 |= 1572864;
                            } else if ((i10 & 1572864) == 0) {
                                if (qVar4.h(aVar)) {
                                    i23 = 1048576;
                                } else {
                                    i23 = 524288;
                                }
                                i12 |= i23;
                            }
                            i24 = i11 & 128;
                            if (i24 == 0) {
                                i26 = i12 | 12582912;
                            } else {
                                if ((i10 & 12582912) == 0) {
                                    int i31 = i12;
                                    if (qVar4.h(pVar2)) {
                                        i27 = 8388608;
                                    } else {
                                        i27 = 4194304;
                                    }
                                    i25 = i31 | i27;
                                } else {
                                    i25 = i12;
                                }
                                i26 = i25;
                            }
                            if ((i26 & 4793491) == 4793490) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!qVar4.O(i26 & 1, z6)) {
                                i3.q qVar5 = i3.q.f13017a;
                                if (i30 != 0) {
                                    tVar3 = qVar5;
                                } else {
                                    tVar3 = tVar2;
                                }
                                if (i14 != 0) {
                                    sizeableHeaderImage2 = null;
                                }
                                if (i16 != 0) {
                                    list2 = tn.t.f33547a;
                                }
                                if (i18 != 0) {
                                    str5 = null;
                                } else {
                                    str5 = str3;
                                }
                                if (i20 != 0) {
                                    pVar3 = null;
                                }
                                if (i22 != 0) {
                                    aVar3 = null;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i24 != 0) {
                                    pVar6 = ComposableSingletons$MediaHeaderSectionKt.INSTANCE.getLambda$211880233$app_productionRelease();
                                } else {
                                    pVar6 = pVar2;
                                }
                                i3.t e10 = p2.e(tVar3, 1.0f);
                                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                                int i32 = EchoTheme.$stable;
                                ho.p pVar7 = pVar3;
                                i3.t G = r1.d.G(e10, echoTheme2.getSpacings(qVar4, i32).getX5(), t2.u.P, 2);
                                i3.j jVar2 = i3.d.C0;
                                r1.x a10 = r1.w.a(r1.j.f29230c, jVar2, qVar4, 48);
                                ho.a aVar4 = aVar3;
                                int hashCode = Long.hashCode(qVar4.T);
                                c3.o l4 = qVar4.l();
                                i3.t c5 = i3.a.c(G, qVar4);
                                h4.h.f11920i.getClass();
                                h4.f fVar = h4.g.f11903b;
                                qVar4.b0();
                                i3.t tVar5 = tVar3;
                                if (qVar4.S) {
                                    qVar4.k(fVar);
                                } else {
                                    qVar4.k0();
                                }
                                u2.r.J(h4.g.f11907f, a10, qVar4);
                                u2.r.J(h4.g.f11906e, l4, qVar4);
                                u2.r.y(qVar4, Integer.valueOf(hashCode), h4.g.f11908g);
                                u2.r.F(h4.g.f11909h, qVar4);
                                u2.r.J(h4.g.f11905d, c5, qVar4);
                                pVar6.invoke(qVar4, Integer.valueOf((i26 >> 21) & 14));
                                r1.d.g(p2.f(qVar5, echoTheme2.getSpacings(qVar4, i32).getX6()), qVar4);
                                if (sizeableHeaderImage2 != null) {
                                    qVar4.X(-79883512);
                                    sizeableHeaderImage4 = sizeableHeaderImage2;
                                    list4 = list2;
                                    qVar2 = qVar5;
                                    tVar4 = tVar5;
                                    jVar = jVar2;
                                    echoTheme = echoTheme2;
                                    i28 = i32;
                                    SizeableHeaderImageKt.m1093SizeableHeaderImagevtUHdqY(sizeableHeaderImage4, null, null, f4.q.f8839b, echoTheme2.getShapes(qVar4, i32).getLg(qVar4, EchoThemeShapes.$stable), null, qVar4, ((i26 >> 6) & 14) | 3072, 38);
                                    r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar4, i28).getX6()), qVar4);
                                    qVar4.p(false);
                                } else {
                                    qVar2 = qVar5;
                                    echoTheme = echoTheme2;
                                    sizeableHeaderImage4 = sizeableHeaderImage2;
                                    i28 = i32;
                                    list4 = list2;
                                    jVar = jVar2;
                                    tVar4 = tVar5;
                                    qVar4.X(-79640379);
                                    qVar4.p(false);
                                }
                                EchoThemeTypography typography = echoTheme.getTypography(qVar4, i28);
                                int i33 = EchoThemeTypography.$stable;
                                s4.y0 baseRegular500 = typography.getBaseRegular500(qVar4, i33);
                                EchoThemeColors.Text text = echoTheme.getColors(qVar4, i28).getText();
                                int i34 = EchoThemeColors.Text.$stable;
                                i3.q qVar6 = qVar2;
                                i3.j jVar3 = jVar;
                                ho.p pVar8 = pVar6;
                                int i35 = i28;
                                SizeableHeaderImage sizeableHeaderImage5 = sizeableHeaderImage4;
                                List<Tag> list5 = list4;
                                EchoTheme echoTheme3 = echoTheme;
                                j7.d(str, null, text.getPrimary(qVar4, i34), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, baseRegular500, qVar4, i26 & 14, 0, 130042);
                                u2.q qVar7 = qVar4;
                                if (str5 == null || wq.n.m0(str5)) {
                                    z10 = false;
                                    qVar7.X(-78824955);
                                    qVar7.p(false);
                                } else {
                                    qVar7.X(-79384257);
                                    r1.d.g(p2.f(qVar6, echoTheme3.getSpacings(qVar7, i35).getX1()), qVar7);
                                    String Q = kj.c.Q(R.string.read_details_by_author, new Object[]{wq.n.L0(str5).toString()}, qVar7);
                                    s4.y0 baseRegular400 = echoTheme3.getTypography(qVar7, i35).getBaseRegular400(qVar7, i33);
                                    long b10 = ib.i.b(i35, i34, echoTheme3, qVar7, qVar7);
                                    i3.t c10 = m3.h.c(qVar6, echoTheme3.getShapes(qVar7, i35).getFull(qVar7, EchoThemeShapes.$stable));
                                    if ((i26 & 3670016) == 1048576) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    Object L = qVar7.L();
                                    if (z11 || L == u2.l.f33918a) {
                                        L = new fm.g(9, aVar4);
                                        qVar7.h0(L);
                                    }
                                    MarkdownTextKt.m1841MarkdownText6lElgYI(Q, r1.d.G(l1.n.p(c10, false, null, null, null, (ho.a) L, 15), echoTheme3.getSpacings(qVar7, i35).getX2(), t2.u.P, 2), b10, 3, baseRegular400, null, null, null, 0, qVar7, 0, 480);
                                    qVar7 = qVar7;
                                    z10 = false;
                                    qVar7.p(false);
                                }
                                if (pVar7 != null) {
                                    qVar7.X(-78783849);
                                    r1.d.g(p2.f(qVar6, echoTheme3.getSpacings(qVar7, i35).getX2()), qVar7);
                                    j0.c.q((i26 >> 15) & 14, pVar7, qVar7, z10);
                                } else {
                                    qVar7.X(-78678139);
                                    qVar7.p(z10);
                                }
                                if (!list5.isEmpty()) {
                                    qVar7.X(-78627764);
                                    r1.d.g(p2.f(qVar6, echoTheme3.getSpacings(qVar7, i35).getX2()), qVar7);
                                    u2.q qVar8 = qVar7;
                                    r1.d.b(p2.e(qVar6, 1.0f), r1.j.h(echoTheme3.getSpacings(qVar7, i35).getX2(), jVar3), ib.i.m(echoTheme3, qVar7, i35), null, 0, 0, c3.k.d(-45095516, true, new w(list5, 0), qVar7), qVar8, 1572870, 56);
                                    qVar3 = qVar8;
                                    qVar3.p(z10);
                                } else {
                                    qVar3 = qVar7;
                                    qVar3.X(-78080955);
                                    qVar3.p(z10);
                                }
                                qVar3.p(true);
                                sizeableHeaderImage3 = sizeableHeaderImage5;
                                pVar4 = pVar8;
                                qVar = qVar3;
                                list3 = list5;
                                pVar5 = pVar7;
                                aVar2 = aVar4;
                                str4 = str5;
                                tVar2 = tVar4;
                            } else {
                                qVar4.R();
                                pVar4 = pVar2;
                                sizeableHeaderImage3 = sizeableHeaderImage2;
                                qVar = qVar4;
                                list3 = list2;
                                str4 = str3;
                                pVar5 = pVar3;
                                aVar2 = aVar;
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new x(str, tVar2, sizeableHeaderImage3, list3, str4, pVar5, aVar2, pVar4, i10, i11);
                                return;
                            }
                            return;
                        }
                        pVar3 = pVar;
                        i22 = i11 & 64;
                        if (i22 == 0) {
                        }
                        i24 = i11 & 128;
                        if (i24 == 0) {
                        }
                        if ((i26 & 4793491) == 4793490) {
                        }
                        if (!qVar4.O(i26 & 1, z6)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    str3 = str2;
                    i20 = i11 & 32;
                    if (i20 != 0) {
                    }
                    pVar3 = pVar;
                    i22 = i11 & 64;
                    if (i22 == 0) {
                    }
                    i24 = i11 & 128;
                    if (i24 == 0) {
                    }
                    if ((i26 & 4793491) == 4793490) {
                    }
                    if (!qVar4.O(i26 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                list2 = list;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                str3 = str2;
                i20 = i11 & 32;
                if (i20 != 0) {
                }
                pVar3 = pVar;
                i22 = i11 & 64;
                if (i22 == 0) {
                }
                i24 = i11 & 128;
                if (i24 == 0) {
                }
                if ((i26 & 4793491) == 4793490) {
                }
                if (!qVar4.O(i26 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            sizeableHeaderImage2 = sizeableHeaderImage;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            list2 = list;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            str3 = str2;
            i20 = i11 & 32;
            if (i20 != 0) {
            }
            pVar3 = pVar;
            i22 = i11 & 64;
            if (i22 == 0) {
            }
            i24 = i11 & 128;
            if (i24 == 0) {
            }
            if ((i26 & 4793491) == 4793490) {
            }
            if (!qVar4.O(i26 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        sizeableHeaderImage2 = sizeableHeaderImage;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        list2 = list;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        str3 = str2;
        i20 = i11 & 32;
        if (i20 != 0) {
        }
        pVar3 = pVar;
        i22 = i11 & 64;
        if (i22 == 0) {
        }
        i24 = i11 & 128;
        if (i24 == 0) {
        }
        if ((i26 & 4793491) == 4793490) {
        }
        if (!qVar4.O(i26 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z MediaHeaderSection$lambda$0$0$0(ho.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MediaHeaderSection$lambda$0$1(List list, r1.v0 v0Var, u2.m mVar, int i10) {
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
                Tag tag = (Tag) it.next();
                MetaChipKt.MetaChip(tag.getTitle(), tag.getIconUrl(), (MetaChipVariant) null, qVar, 0, 4);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MediaHeaderSection$lambda$1(String str, i3.t tVar, SizeableHeaderImage sizeableHeaderImage, List list, String str2, ho.p pVar, ho.a aVar, ho.p pVar2, int i10, int i11, u2.m mVar, int i12) {
        MediaHeaderSection(str, tVar, sizeableHeaderImage, list, str2, pVar, aVar, pVar2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_MediaHeaderSection(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1171971314);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SizeableHeaderImage sizeableHeaderImage = new SizeableHeaderImage("file:///android_asset/read_cover_preview.jpg", 1.0f, 0.6f, 300.0f, Float.valueOf(8.0f));
            List I = ig.f.I(new Tag("Fiction", "https://example.com/fiction-icon.png"), new Tag("Classic", null), new Tag("American Literature", "https://example.com/literature-icon.png"));
            ho.p lambda$148784408$app_productionRelease = ComposableSingletons$MediaHeaderSectionKt.INSTANCE.getLambda$148784408$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(6);
                qVar.h0(L);
            }
            MediaHeaderSection("The Great Gatsby", null, sizeableHeaderImage, I, "F. Scott Fitzgerald", lambda$148784408$app_productionRelease, (ho.a) L, null, qVar, 1794054, 130);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 10);
        }
    }

    public static final sn.z Preview_MediaHeaderSection$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MediaHeaderSection(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
