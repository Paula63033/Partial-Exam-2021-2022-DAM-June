package dam.gtidic.examenfinal2122.usecases.adventure;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import dam.gtidic.examenfinal2122.utils.PreferencesProvider;

public class AdventureViewModel  extends ViewModel {
    public MutableLiveData<String> adventure;

    //constructor
    public AdventureViewModel() {
        this.adventure = new MutableLiveData<>();
    }


}
