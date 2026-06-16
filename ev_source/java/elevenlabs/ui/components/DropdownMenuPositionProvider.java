package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001aR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001c¨\u00061"}, d2 = {"Lio/elevenlabs/ui/components/DropdownMenuPositionProvider;", "Ll5/a0;", "Lh5/g;", "contentOffset", "Lh5/c;", "density", "Lkotlin/Function2;", "Lh5/k;", "Lsn/z;", "onPositionCalculated", "<init>", "(JLh5/c;Lho/p;Lkotlin/jvm/internal/f;)V", "anchorBounds", "Lh5/l;", "windowSize", "Lh5/m;", "layoutDirection", "popupContentSize", "Lh5/j;", "calculatePosition-llwVHH4", "(Lh5/k;JLh5/m;J)J", "calculatePosition", "component1-RKDOV3M", "()J", "component1", "component2", "()Lh5/c;", "component3", "()Lho/p;", "copy-rOJDEFc", "(JLh5/c;Lho/p;)Lio/elevenlabs/ui/components/DropdownMenuPositionProvider;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getContentOffset-RKDOV3M", "Lh5/c;", "getDensity", "Lho/p;", "getOnPositionCalculated", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class DropdownMenuPositionProvider implements l5.a0 {
    private final long contentOffset;
    private final h5.c density;
    private final ho.p onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j4, h5.c cVar, ho.p pVar, int i10, kotlin.jvm.internal.f fVar) {
        this(j4, cVar, (i10 & 4) != 0 ? new j(1) : pVar, null);
    }

    public static final sn.z _init_$lambda$0(h5.k kVar, h5.k kVar2) {
        kVar.getClass();
        kVar2.getClass();
        return sn.z.f31622a;
    }

    /* renamed from: copy-rOJDEFc$default */
    public static /* synthetic */ DropdownMenuPositionProvider m1831copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j4, h5.c cVar, ho.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i10 & 2) != 0) {
            cVar = dropdownMenuPositionProvider.density;
        }
        if ((i10 & 4) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1833copyrOJDEFc(j4, cVar, pVar);
    }

    @Override // l5.a0
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo939calculatePositionllwVHH4(h5.k anchorBounds, long windowSize, h5.m layoutDirection, long popupContentSize) {
        float f10;
        vq.h n02;
        Object obj;
        Object obj2;
        anchorBounds.getClass();
        layoutDirection.getClass();
        h5.c cVar = this.density;
        f10 = MenuKt.MenuVerticalMargin;
        int B = cVar.B(f10);
        int B2 = this.density.B(Float.intBitsToFloat((int) (this.contentOffset >> 32)));
        int B3 = this.density.B(Float.intBitsToFloat((int) (this.contentOffset & 4294967295L)));
        int i10 = anchorBounds.f12088a;
        int i11 = i10 + B2;
        int i12 = anchorBounds.f12090c;
        int i13 = (int) (popupContentSize >> 32);
        int i14 = (i12 - B2) - i13;
        int i15 = (int) (windowSize >> 32);
        int i16 = i15 - i13;
        if (layoutDirection == h5.m.f12093a) {
            Integer valueOf = Integer.valueOf(i11);
            Integer valueOf2 = Integer.valueOf(i14);
            if (i10 < 0) {
                i16 = 0;
            }
            n02 = tn.n.n0(new Integer[]{valueOf, valueOf2, Integer.valueOf(i16)});
        } else {
            Integer valueOf3 = Integer.valueOf(i14);
            Integer valueOf4 = Integer.valueOf(i11);
            if (i12 <= i15) {
                i16 = 0;
            }
            n02 = tn.n.n0(new Integer[]{valueOf3, valueOf4, Integer.valueOf(i16)});
        }
        Iterator it = n02.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                int intValue = ((Number) obj2).intValue();
                if (intValue >= 0 && intValue + i13 <= i15) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            i14 = num.intValue();
        }
        int max = Math.max(anchorBounds.f12091d + B3, B);
        int i17 = anchorBounds.f12089b;
        int i18 = (int) (popupContentSize & 4294967295L);
        int i19 = (i17 - B3) - i18;
        int i20 = (int) (windowSize & 4294967295L);
        Iterator it2 = tn.n.n0(new Integer[]{Integer.valueOf(max), Integer.valueOf(i19), Integer.valueOf(i17 - (i18 / 2)), Integer.valueOf((i20 - i18) - B)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= B && intValue2 + i18 <= i20 - B) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            i19 = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new h5.k(i14, i19, i13 + i14, i18 + i19));
        return (i14 << 32) | (i19 & 4294967295L);
    }

    /* renamed from: component1-RKDOV3M, reason: from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final h5.c getDensity() {
        return this.density;
    }

    /* renamed from: component3, reason: from getter */
    public final ho.p getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-rOJDEFc */
    public final DropdownMenuPositionProvider m1833copyrOJDEFc(long contentOffset, h5.c density, ho.p onPositionCalculated) {
        density.getClass();
        onPositionCalculated.getClass();
        return new DropdownMenuPositionProvider(contentOffset, density, onPositionCalculated, null);
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof DropdownMenuPositionProvider) {
                DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
                if (this.contentOffset == dropdownMenuPositionProvider.contentOffset && kotlin.jvm.internal.m.c(this.density, dropdownMenuPositionProvider.density) && kotlin.jvm.internal.m.c(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: getContentOffset-RKDOV3M */
    public final long m1834getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final h5.c getDensity() {
        return this.density;
    }

    public final ho.p getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return this.onPositionCalculated.hashCode() + ((this.density.hashCode() + (Long.hashCode(this.contentOffset) * 31)) * 31);
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + h5.g.a(this.contentOffset) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + Separators.RPAREN;
    }

    private DropdownMenuPositionProvider(long j4, h5.c cVar, ho.p pVar) {
        cVar.getClass();
        pVar.getClass();
        this.contentOffset = j4;
        this.density = cVar;
        this.onPositionCalculated = pVar;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j4, h5.c cVar, ho.p pVar, kotlin.jvm.internal.f fVar) {
        this(j4, cVar, pVar);
    }
}
