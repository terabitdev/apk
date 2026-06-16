package io.elevenlabs.ocr;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.ocr.usecase.RecognizeDocumentTextUseCase;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ocr.OcrImportViewModel$listen$1$1$text$1$1", f = "OcrImportScreen.kt", l = {198}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "", "<anonymous>", "(Lfr/d0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OcrImportViewModel$listen$1$1$text$1$1 extends yn.i implements ho.p {
    final /* synthetic */ Uri $it;
    int label;
    final /* synthetic */ OcrImportViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrImportViewModel$listen$1$1$text$1$1(OcrImportViewModel ocrImportViewModel, Uri uri, wn.c<? super OcrImportViewModel$listen$1$1$text$1$1> cVar) {
        super(2, cVar);
        this.this$0 = ocrImportViewModel;
        this.$it = uri;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new OcrImportViewModel$listen$1$1$text$1$1(this.this$0, this.$it, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super String> cVar) {
        return ((OcrImportViewModel$listen$1$1$text$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fc A[Catch: FileNotFoundException -> 0x0069, TryCatch #2 {FileNotFoundException -> 0x0069, blocks: (B:11:0x0049, B:13:0x004f, B:15:0x005c, B:17:0x00b4, B:18:0x00c9, B:21:0x00fc, B:23:0x0106, B:29:0x00cf, B:31:0x00d3, B:32:0x00da, B:33:0x00de, B:34:0x00e5, B:35:0x00e9, B:36:0x00f1, B:44:0x00ae, B:49:0x009e, B:70:0x0134, B:71:0x013b), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf A[Catch: FileNotFoundException -> 0x0069, TryCatch #2 {FileNotFoundException -> 0x0069, blocks: (B:11:0x0049, B:13:0x004f, B:15:0x005c, B:17:0x00b4, B:18:0x00c9, B:21:0x00fc, B:23:0x0106, B:29:0x00cf, B:31:0x00d3, B:32:0x00da, B:33:0x00de, B:34:0x00e5, B:35:0x00e9, B:36:0x00f1, B:44:0x00ae, B:49:0x009e, B:70:0x0134, B:71:0x013b), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3 A[Catch: FileNotFoundException -> 0x0069, TryCatch #2 {FileNotFoundException -> 0x0069, blocks: (B:11:0x0049, B:13:0x004f, B:15:0x005c, B:17:0x00b4, B:18:0x00c9, B:21:0x00fc, B:23:0x0106, B:29:0x00cf, B:31:0x00d3, B:32:0x00da, B:33:0x00de, B:34:0x00e5, B:35:0x00e9, B:36:0x00f1, B:44:0x00ae, B:49:0x009e, B:70:0x0134, B:71:0x013b), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da A[Catch: FileNotFoundException -> 0x0069, TryCatch #2 {FileNotFoundException -> 0x0069, blocks: (B:11:0x0049, B:13:0x004f, B:15:0x005c, B:17:0x00b4, B:18:0x00c9, B:21:0x00fc, B:23:0x0106, B:29:0x00cf, B:31:0x00d3, B:32:0x00da, B:33:0x00de, B:34:0x00e5, B:35:0x00e9, B:36:0x00f1, B:44:0x00ae, B:49:0x009e, B:70:0x0134, B:71:0x013b), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de A[Catch: FileNotFoundException -> 0x0069, TryCatch #2 {FileNotFoundException -> 0x0069, blocks: (B:11:0x0049, B:13:0x004f, B:15:0x005c, B:17:0x00b4, B:18:0x00c9, B:21:0x00fc, B:23:0x0106, B:29:0x00cf, B:31:0x00d3, B:32:0x00da, B:33:0x00de, B:34:0x00e5, B:35:0x00e9, B:36:0x00f1, B:44:0x00ae, B:49:0x009e, B:70:0x0134, B:71:0x013b), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5 A[Catch: FileNotFoundException -> 0x0069, TryCatch #2 {FileNotFoundException -> 0x0069, blocks: (B:11:0x0049, B:13:0x004f, B:15:0x005c, B:17:0x00b4, B:18:0x00c9, B:21:0x00fc, B:23:0x0106, B:29:0x00cf, B:31:0x00d3, B:32:0x00da, B:33:0x00de, B:34:0x00e5, B:35:0x00e9, B:36:0x00f1, B:44:0x00ae, B:49:0x009e, B:70:0x0134, B:71:0x013b), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[Catch: FileNotFoundException -> 0x0069, TryCatch #2 {FileNotFoundException -> 0x0069, blocks: (B:11:0x0049, B:13:0x004f, B:15:0x005c, B:17:0x00b4, B:18:0x00c9, B:21:0x00fc, B:23:0x0106, B:29:0x00cf, B:31:0x00d3, B:32:0x00da, B:33:0x00de, B:34:0x00e5, B:35:0x00e9, B:36:0x00f1, B:44:0x00ae, B:49:0x009e, B:70:0x0134, B:71:0x013b), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1 A[Catch: FileNotFoundException -> 0x0069, TryCatch #2 {FileNotFoundException -> 0x0069, blocks: (B:11:0x0049, B:13:0x004f, B:15:0x005c, B:17:0x00b4, B:18:0x00c9, B:21:0x00fc, B:23:0x0106, B:29:0x00cf, B:31:0x00d3, B:32:0x00da, B:33:0x00de, B:34:0x00e5, B:35:0x00e9, B:36:0x00f1, B:44:0x00ae, B:49:0x009e, B:70:0x0134, B:71:0x013b), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae A[Catch: FileNotFoundException -> 0x0069, TryCatch #2 {FileNotFoundException -> 0x0069, blocks: (B:11:0x0049, B:13:0x004f, B:15:0x005c, B:17:0x00b4, B:18:0x00c9, B:21:0x00fc, B:23:0x0106, B:29:0x00cf, B:31:0x00d3, B:32:0x00da, B:33:0x00de, B:34:0x00e5, B:35:0x00e9, B:36:0x00f1, B:44:0x00ae, B:49:0x009e, B:70:0x0134, B:71:0x013b), top: B:10:0x0049 }] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        Context context;
        i7.h hVar;
        Matrix matrix;
        Object invoke;
        xn.a aVar2;
        Bitmap createBitmap;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        aVar = this.this$0.recognizeDocumentTextUseCase;
        RecognizeDocumentTextUseCase recognizeDocumentTextUseCase = (RecognizeDocumentTextUseCase) aVar.get();
        context = this.this$0.context;
        Uri uri = this.$it;
        l0.h(context, "Please provide a valid Context");
        l0.h(uri, "Please provide a valid imageUri");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kj.a aVar3 = kj.a.f20533b;
        ContentResolver contentResolver = context.getContentResolver();
        aVar3.getClass();
        com.google.android.gms.common.internal.n nVar = kj.a.f20532a;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap != null) {
                int i11 = 0;
                if (FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                    try {
                        InputStream openInputStream = contentResolver.openInputStream(uri);
                        if (openInputStream != null) {
                            try {
                                hVar = new i7.h(openInputStream);
                            } catch (Throwable th) {
                                try {
                                    openInputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        throw th;
                                    } catch (Exception unused) {
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            hVar = null;
                        }
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (IOException e10) {
                                e = e10;
                                nVar.a(e, "MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)));
                                if (hVar != null) {
                                }
                                Matrix matrix2 = new Matrix();
                                int width = bitmap.getWidth();
                                int height = bitmap.getHeight();
                                switch (i11) {
                                }
                                if (matrix != null) {
                                }
                                jj.a aVar4 = new jj.a(bitmap);
                                Bitmap bitmap2 = bitmap;
                                zzmu.zza(zzms.zzb("vision-common"), -1, 4, elapsedRealtime, bitmap2.getHeight(), bitmap2.getWidth(), bitmap2.getAllocationByteCount(), 0);
                                this.label = 1;
                                invoke = recognizeDocumentTextUseCase.invoke(aVar4, this);
                                aVar2 = xn.a.f37986a;
                                if (invoke == aVar2) {
                                }
                            }
                        }
                    } catch (IOException e11) {
                        e = e11;
                        hVar = null;
                        nVar.a(e, "MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)));
                        if (hVar != null) {
                        }
                        Matrix matrix22 = new Matrix();
                        int width2 = bitmap.getWidth();
                        int height2 = bitmap.getHeight();
                        switch (i11) {
                        }
                        if (matrix != null) {
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                        jj.a aVar42 = new jj.a(bitmap);
                        Bitmap bitmap22 = bitmap;
                        zzmu.zza(zzms.zzb("vision-common"), -1, 4, elapsedRealtime, bitmap22.getHeight(), bitmap22.getWidth(), bitmap22.getAllocationByteCount(), 0);
                        this.label = 1;
                        invoke = recognizeDocumentTextUseCase.invoke(aVar42, this);
                        aVar2 = xn.a.f37986a;
                        if (invoke == aVar2) {
                        }
                    }
                    if (hVar != null) {
                        i11 = hVar.d(1, "Orientation");
                    }
                }
                Matrix matrix222 = new Matrix();
                int width22 = bitmap.getWidth();
                int height22 = bitmap.getHeight();
                switch (i11) {
                    case 2:
                        matrix222 = new Matrix();
                        matrix222.postScale(-1.0f, 1.0f);
                        matrix = matrix222;
                        break;
                    case 3:
                        matrix222.postRotate(180.0f);
                        matrix = matrix222;
                        break;
                    case 4:
                        matrix222.postScale(1.0f, -1.0f);
                        matrix = matrix222;
                        break;
                    case 5:
                        matrix222.postRotate(90.0f);
                        matrix222.postScale(-1.0f, 1.0f);
                        matrix = matrix222;
                        break;
                    case 6:
                        matrix222.postRotate(90.0f);
                        matrix = matrix222;
                        break;
                    case 7:
                        matrix222.postRotate(-90.0f);
                        matrix222.postScale(-1.0f, 1.0f);
                        matrix = matrix222;
                        break;
                    case 8:
                        matrix222.postRotate(-90.0f);
                        matrix = matrix222;
                        break;
                    default:
                        matrix = null;
                        break;
                }
                if (matrix != null && bitmap != (createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width22, height22, matrix, true))) {
                    bitmap.recycle();
                    bitmap = createBitmap;
                }
                jj.a aVar422 = new jj.a(bitmap);
                Bitmap bitmap222 = bitmap;
                zzmu.zza(zzms.zzb("vision-common"), -1, 4, elapsedRealtime, bitmap222.getHeight(), bitmap222.getWidth(), bitmap222.getAllocationByteCount(), 0);
                this.label = 1;
                invoke = recognizeDocumentTextUseCase.invoke(aVar422, this);
                aVar2 = xn.a.f37986a;
                if (invoke == aVar2) {
                    return aVar2;
                }
                return invoke;
            }
            throw new IOException("The image Uri could not be resolved.");
        } catch (FileNotFoundException e12) {
            nVar.a(e12, "MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)));
            throw e12;
        }
    }
}
