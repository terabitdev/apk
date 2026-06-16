package io.elevenlabs.ocr.usecase;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.c6;
import hj.d;
import hj.g;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.highlighter.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import jd.h0;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import lj.f;
import nj.e;
import oj.a;
import sn.k;
import t2.u;
import tn.o;
import tn.p;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0086B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/ocr/usecase/RecognizeDocumentTextUseCase;", "", "Lio/elevenlabs/domain/Configuration;", "configuration", "<init>", "(Lio/elevenlabs/domain/Configuration;)V", "Landroid/graphics/Bitmap;", "originalBitmap", "", "Llj/d;", "textBlocks", "", "marginSize", "largestBlockMarginLeft", "largestBlockMarginRight", "drawTextBlocksOnBitmap", "(Landroid/graphics/Bitmap;Ljava/util/List;III)Landroid/graphics/Bitmap;", "Ljj/a;", "inputImage", "", "invoke", "(Ljj/a;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/Configuration;", "Llj/f;", "recognizer", "Llj/f;", "ocr_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RecognizeDocumentTextUseCase {
    public static final int $stable = 8;
    private final Configuration configuration;
    private final f recognizer;

    public RecognizeDocumentTextUseCase(Configuration configuration) {
        configuration.getClass();
        this.configuration = configuration;
        a aVar = a.f25173c;
        e eVar = (e) g.c().a(e.class);
        nj.a aVar2 = (nj.a) eVar.f24524a.get(aVar);
        d dVar = eVar.f24525b;
        aVar.getClass();
        this.recognizer = new nj.d(aVar2, (Executor) dVar.f12374a.get(), zzun.zzb(aVar.b()), aVar);
    }

    public static /* synthetic */ CharSequence a(lj.d dVar) {
        return invoke$lambda$6(dVar);
    }

    private final Bitmap drawTextBlocksOnBitmap(Bitmap originalBitmap, List<? extends lj.d> textBlocks, int marginSize, int largestBlockMarginLeft, int largestBlockMarginRight) {
        Bitmap copy = originalBitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(copy);
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
        float f10 = marginSize;
        canvas.drawLine(f10, u.P, f10, copy.getHeight(), paint);
        canvas.drawLine(originalBitmap.getWidth() - f10, u.P, originalBitmap.getWidth() - f10, copy.getHeight(), paint);
        paint.setColor(-16776961);
        float f11 = largestBlockMarginLeft;
        canvas.drawLine(f11, u.P, f11, copy.getHeight(), paint);
        float f12 = largestBlockMarginRight;
        canvas.drawLine(f12, u.P, f12, copy.getHeight(), paint);
        paint.setColor(-16711936);
        Iterator<? extends lj.d> it = textBlocks.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next().f7881c;
            rect.getClass();
            canvas.drawRect(rect, paint);
        }
        return copy;
    }

    public static final CharSequence invoke$lambda$6(lj.d dVar) {
        String str = (String) dVar.f7880b;
        if (str == null) {
            str = "";
        }
        return wq.u.T(wq.u.T(str, "-\n", ""), Separators.RETURN, Separators.SP);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4 A[LOOP:1: B:22:0x00de->B:24:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(jj.a aVar, c<? super String> cVar) {
        RecognizeDocumentTextUseCase$invoke$1 recognizeDocumentTextUseCase$invoke$1;
        int i10;
        int i11;
        Task forException;
        Object j4;
        int i12;
        ArrayList arrayList;
        Iterator it;
        if (cVar instanceof RecognizeDocumentTextUseCase$invoke$1) {
            recognizeDocumentTextUseCase$invoke$1 = (RecognizeDocumentTextUseCase$invoke$1) cVar;
            int i13 = recognizeDocumentTextUseCase$invoke$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                recognizeDocumentTextUseCase$invoke$1.label = i13 - Integer.MIN_VALUE;
                Object obj = recognizeDocumentTextUseCase$invoke$1.result;
                xn.a aVar2 = xn.a.f37986a;
                i10 = recognizeDocumentTextUseCase$invoke$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        int i14 = recognizeDocumentTextUseCase$invoke$1.I$1;
                        i12 = recognizeDocumentTextUseCase$invoke$1.I$0;
                        jj.a aVar3 = (jj.a) recognizeDocumentTextUseCase$invoke$1.L$0;
                        sn.a.g(obj);
                        i11 = i14;
                        aVar = aVar3;
                        j4 = obj;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    int i15 = aVar.f19563b;
                    int i16 = i15 / 20;
                    i11 = i15 / 5;
                    nj.d dVar = (nj.d) this.recognizer;
                    synchronized (dVar) {
                        if (dVar.f20535a.get()) {
                            forException = Tasks.forException(new dj.a("This detector is already closed!", 14));
                        } else if (aVar.f19563b >= 32 && aVar.f19564c >= 32) {
                            forException = dVar.f20536b.a(dVar.f20538d, new h0(dVar, aVar, 1), dVar.f20537c.getToken());
                        } else {
                            forException = Tasks.forException(new dj.a("InputImage width and height should be at least 32!", 3));
                        }
                    }
                    forException.getClass();
                    recognizeDocumentTextUseCase$invoke$1.L$0 = aVar;
                    recognizeDocumentTextUseCase$invoke$1.I$0 = i16;
                    recognizeDocumentTextUseCase$invoke$1.I$1 = i11;
                    recognizeDocumentTextUseCase$invoke$1.label = 1;
                    j4 = kj.c.j(forException, recognizeDocumentTextUseCase$invoke$1);
                    if (j4 == aVar2) {
                        return aVar2;
                    }
                    i12 = i16;
                }
                List unmodifiableList = Collections.unmodifiableList(((lj.e) j4).f21922a);
                unmodifiableList.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : unmodifiableList) {
                    if (((Rect) ((lj.d) obj2).f7881c) != null) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(p.a0(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    lj.d dVar2 = (lj.d) it.next();
                    Rect rect = (Rect) dVar2.f7881c;
                    rect.getClass();
                    arrayList.add(new k(dVar2, rect));
                }
                if (!arrayList.isEmpty()) {
                    return "";
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (it2.hasNext()) {
                        int width = ((Rect) ((k) next).f31601b).width();
                        do {
                            Object next2 = it2.next();
                            int width2 = ((Rect) ((k) next2).f31601b).width();
                            if (width < width2) {
                                next = next2;
                                width = width2;
                            }
                        } while (it2.hasNext());
                    }
                    Rect rect2 = (Rect) ((k) next).f31601b;
                    int i17 = rect2.left - i12;
                    int i18 = rect2.right + i12;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        Rect rect3 = (Rect) ((k) next3).f31601b;
                        if (rect3.width() >= i11 || (rect3.left >= i12 && rect3.right <= aVar.f19563b - i12)) {
                            arrayList3.add(next3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Object next4 = it4.next();
                        Rect rect4 = (Rect) ((k) next4).f31601b;
                        if (rect4.left >= i17 && rect4.right <= i18) {
                            arrayList4.add(next4);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(p.a0(arrayList4, 10));
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add((lj.d) ((k) it5.next()).f31600a);
                    }
                    this.configuration.getDebugMode();
                    return o.E0(arrayList5, Separators.RETURN, null, null, new z(8), 30);
                }
                zr.o.a();
                return null;
            }
        }
        recognizeDocumentTextUseCase$invoke$1 = new RecognizeDocumentTextUseCase$invoke$1(this, cVar);
        Object obj3 = recognizeDocumentTextUseCase$invoke$1.result;
        xn.a aVar22 = xn.a.f37986a;
        i10 = recognizeDocumentTextUseCase$invoke$1.label;
        if (i10 == 0) {
        }
        List unmodifiableList2 = Collections.unmodifiableList(((lj.e) j4).f21922a);
        unmodifiableList2.getClass();
        ArrayList arrayList22 = new ArrayList();
        while (r0.hasNext()) {
        }
        arrayList = new ArrayList(p.a0(arrayList22, 10));
        it = arrayList22.iterator();
        while (it.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
    }
}
